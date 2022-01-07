package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.wikipathia.application.model.WikiPath;
import com.wikipathia.application.model.WikiPathStop;
import com.wikipathia.application.model.trafiklab.route.*;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {
    @RequestMapping(value = "/stops", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTest() {
        System.out.println("getting stops");
        ArrayList<Stop> stops = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/static/stops.csv"))) {
            String current;
            reader.readLine();
            while ((current = reader.readLine()) != null) {
                Stop stop = new Stop();
                stop.setId(String.valueOf(Integer.parseInt(current.split(",")[0])));
                stop.setName( current.split(",")[1]);
                stops.add(stop);
            }
        } catch (Exception e) {

        }

        Gson gson  = new Gson();
        String json = gson.toJson(stops);

        return json;
    }

    @RequestMapping(value = "/api/routeArticles", method = RequestMethod.GET)
    public String getRouteArticles(@RequestParam(required = true, name = "originID")int originId, @RequestParam(required = true, name = "destinationID") int destinationId, @RequestParam Map<String,String> parameters ) {
        TrafikLabService trafikLabService = MainController.getTrafikLabService();
        WikipediaService wikipediaService = MainController.getWikiService();

        Route route = trafikLabService.getRouteFromID(originId,destinationId);

        List<Leg> legs = route.getTrip().get(0).getLegList().getLeg();
        WikiPath path = new WikiPath();

        for (int legCount = 0; legCount < legs.size(); legCount++) {

            if (legs.get(legCount).getStops() != null) {
                List<Stop> stops = legs.get(legCount).getStops().getStop();
                for (int stopCount = 0; stopCount < stops.size() - 1; stopCount++) {
                    Stop stop = stops.get(stopCount);

                    configWikiPathStop(path ,wikipediaService,stop,parameters);

                }
                if (legCount == legs.size() - 1) {
                    Destination stop = legs.get(legs.size() - 1).getDestination();

                    configWikiPathStop(path ,wikipediaService,stop,parameters);

                }
            } else {
                Destination stopDestination = legs.get(legs.size() - 1).getDestination();
                Origin stopOrigin = legs.get(legs.size() - 1).getOrigin();

                configWikiPathStop(path ,wikipediaService,stopOrigin,parameters);

                if (legCount == legs.size() - 1) {

                    configWikiPathStop(path ,wikipediaService,stopDestination,parameters);

                }
            }
        }

        Gson gson = new Gson();
        String json = gson.toJson(path);
        return json;
    }

    private void configWikiPathStop(WikiPath path, WikipediaService service , Stop stop, Map<String,String> param) {
        double lat = stop.getLat();
        double lon = stop.getLon();

        int numArticles = 5;

        WikiPathStop wikiPathStop = new WikiPathStop();

        for (Map.Entry<String, String> entry : param.entrySet()) {
            switch (entry.getKey()) {
                case "showTimes" :
                    if (entry.getValue().equals("true")){
                        wikiPathStop.setArrivalTime(stop.getArrTime());
                        wikiPathStop.setDepartureTime(stop.getDepTime());
                        System.out.println("set times in json");
                    }
                    break;
                case "numArticles" :
                    try {
                        System.out.println("Setting num articles");
                        numArticles = Integer.parseInt(entry.getValue());
                    } catch (NumberFormatException e ) {
                        System.out.println("Not a number using default");
                        numArticles = 5;
                    }
                    break;
                default:
                    break;
            }
        }


        WikipediaPages page = service.getWikipediaPagesFromCoordinates(lat, lon,10000,numArticles);

        wikiPathStop.setPages(page.getQuery().getGeosearch());

        wikiPathStop.setQueryLat(lat);
        wikiPathStop.setQueryLon(lon);
        wikiPathStop.setStopName(stop.getName());




        path.add(wikiPathStop);
    }
}
