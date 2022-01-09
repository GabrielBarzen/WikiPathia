package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.wikipathia.application.model.Error;
import com.wikipathia.application.model.ParameterError;
import com.wikipathia.application.model.WikiPath;
import com.wikipathia.application.model.WikiPathStop;
import com.wikipathia.application.model.trafiklab.route.Leg;
import com.wikipathia.application.model.trafiklab.route.Route;
import com.wikipathia.application.model.trafiklab.route.Stop;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Main controller class for all HTTP request to the WikiPathia API.
 */
@RestController
@RequestMapping("api")
public class ApiController {

    private ArrayList<String> badParam = new ArrayList<>();

    /**
     * Handles incoming GET requests to retrieve String representation of stops.csv, used to find available stops on a route.
     * @return String representation of stops.csv
     */
    @RequestMapping(value = "/stops", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getStops() {
        String json = "";
        Gson gson  = new Gson();
        ResponseEntity<String> responseEntity;
        ArrayList<Stop> stops = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/static/stops.csv"))) {
            String current;
            reader.readLine();
            while ((current = reader.readLine()) != null) {
                current = new String(current.getBytes(),StandardCharsets.UTF_8);
                Stop stop = new Stop();
                stop.setId(String.valueOf(Integer.parseInt(current.split(",")[0])));
                stop.setName( current.split(",")[1]);
                stops.add(stop);
            }
            json = gson.toJson(stops);
            responseEntity = ResponseEntity.status(HttpStatus.OK).body(json);
        } catch (Exception e) {
            Error error = new Error();
            error.setError("Internal server error");
            error.setDescription("Server unable to locate file");
            json = gson.toJson(error);
            responseEntity = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(json);
        }


        return responseEntity;
    }

    /**
     * Handles incoming GET requests to retrieve HTML contents of a Wikipedia article.
     * @param pageid the id of the Wikipedia article
     * @return HTML-document with Wikipedia article content in json format
     */
    @RequestMapping(value = "/wiki", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHTML(@RequestParam(required = true, name = "pageid")int pageid) {

        String json = MainController.getWikiService().getWikiHTML(pageid);

        return json;
    }

    /**
     * Handles redirects to sv.wikipedia.org when a user clicks on a link in an article displayed on the WikiPathia page.
     * @param page name of the page to open at sv.wikipedia.org
     * @return Spring Boot RedirectView-object
     */
    @RequestMapping(value = "/wiki/{page}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RedirectView wikiRedirect(@PathVariable("page") String page) {
        RedirectView view = new RedirectView();
        String pageEncode = URLEncoder.encode(page, StandardCharsets.UTF_8);
        view.setUrl("https://sv.wikipedia.org/wiki/" + pageEncode);

        return view;
    }

    /**
     * Handles incoming GET requests to retrieve json data with list of Wikipedia articles from specified Route.
     * @param originId TrafikLab id for the starting point of the route, initially fetched from stops.csv
     * @param destinationId TrafikLab id for the final destination of the route, initially fetched from stops.csv
     * @param parameters collection of parameters to specify which data to include in request
     * @return String representation of json data
     */
    @RequestMapping(value = "/routeArticles", method = RequestMethod.GET)
    public ResponseEntity<String> getRouteArticles(@RequestParam(required = true, name = "originID")int originId, @RequestParam(required = true, name = "destinationID") int destinationId, @RequestParam Map<String,String> parameters ) {
        TrafikLabService trafikLabService = MainController.getTrafikLabService();
        WikipediaService wikipediaService = MainController.getWikiService();

        Route route = trafikLabService.getRouteFromID(originId,destinationId);
        if (route.getTrip() == null) {
            Error error = new Error();
            Gson gson = new Gson();
            error.setError("bad request");
            error.setDescription("Bad error such as bad ID for trafiklab, get list of id with /api/stops");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(gson.toJson(error));
        }

        List<Leg> legs = route.getTrip().get(0).getLegList().getLeg();
        WikiPath path = new WikiPath();

        for (int legCount = 0; legCount < legs.size(); legCount++) {
            if (legs.get(legCount).getStops() != null) {
                List<Stop> stops = legs.get(legCount).getStops().getStop();
                for (int stopCount = 0; stopCount < stops.size() - 1; stopCount++) {
                    Stop stop = stops.get(stopCount);

                    configWikiPathStop(path, wikipediaService, stop,parameters);

                }
                if (legCount == legs.size() - 1) {
                    Stop stop = legs.get(legs.size()-1).getDestination();
                    configWikiPathStop(path, wikipediaService, stop,parameters);
                }
            } else {

                Stop stop = legs.get(legCount).getOrigin();
                configWikiPathStop(path, wikipediaService, stop,parameters);

                if (legCount == legs.size() - 1) {
                    stop = legs.get(legCount).getDestination();
                    configWikiPathStop(path, wikipediaService, stop,parameters);

                }
            }
        }

        Gson gson = new Gson();
        String json = gson.toJson(path);
        if (!badParam.isEmpty()) {
            Error error = new Error();
            error.setError("Bad parameters");
            error.setDescription("Bad parameters for routeArticles");
            ArrayList<ParameterError> badParameters = new ArrayList<>();
            for (String s : badParam) {
                ParameterError parameterError = new ParameterError();
                parameterError.setError("bad param");
                parameterError.setParameter(s);
                badParameters.add(parameterError);
            }
            error.setParameter_error(badParameters);
            json += gson.toJson(error);
        }
        return ResponseEntity.status(HttpStatus.OK).body(json);
    }

    /**
     * Method used to fully build the model object of a Wikipath (representation of a full route).
     * @param path the WikiPath currently being built/configured
     * @param service the WikipediaService used to fetch articles
     * @param stop the stop currently used to fetch articles for
     * @param param collection of parameters to specify which data to include in request
     */
    private void configWikiPathStop(WikiPath path, WikipediaService service, Stop stop, Map<String,String> param) {
        double lat = stop.getLat();
        double lon = stop.getLon();

        int numArticles = 5;
        int geoRadius = 10000;

        WikiPathStop wikiPathStop = new WikiPathStop();
        badParam = new ArrayList<>();


        for (Map.Entry<String, String> entry : param.entrySet()) {
            switch (entry.getKey()) {
                case "showTimes" :
                    if (entry.getValue().equals("true")){
                        wikiPathStop.setArrivalTime(stop.getArrTime());
                        wikiPathStop.setDepartureTime(stop.getDepTime());
                    }
                    break;
                case "numArticles" :
                    try {
                        numArticles = Integer.parseInt(entry.getValue());
                    } catch (NumberFormatException e ) {
                        numArticles = 5;
                    }
                    break;
                case "geoRadius" :
                    try {
                        geoRadius = Integer.parseInt(entry.getValue());
                    } catch (NumberFormatException e ) {
                        geoRadius = 10000;
                    }
                    break;
                default:
                    badParam.add(entry.getValue());
                    break;
            }
        }


        WikipediaPages page = service.getWikipediaPagesFromCoordinates(lat, lon,geoRadius,numArticles);

        wikiPathStop.setPages(page.getQuery().getGeosearch());

        wikiPathStop.setQueryLat(lat);
        wikiPathStop.setQueryLon(lon);
        wikiPathStop.setStopName(stop.getName());

        path.add(wikiPathStop);
    }
}
