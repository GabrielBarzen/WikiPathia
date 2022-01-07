package com.wikipathia.application.controller;
import com.google.gson.Gson;
import com.wikipathia.application.model.WikiPath;
import com.wikipathia.application.model.WikiPathStop;
import com.wikipathia.application.model.trafiklab.route.*;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class IndexController {


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

        WikiPathStop wikiPathStop = new WikiPathStop();
        WikipediaPages page = service.getWikipediaPagesFromCoordinates(lat, lon);

        wikiPathStop.setPages(page.getQuery().getGeosearch());

        wikiPathStop.setQueryLat(lat);
        wikiPathStop.setQueryLon(lon);
        wikiPathStop.setStopName(stop.getName());

        for (Map.Entry<String, String> entry : param.entrySet()) {
            switch (entry.getKey()) {
                case "showTimes" :
                    if (entry.getValue().equals("true")){
                        wikiPathStop.setArrivalTime(stop.getArrTime());
                        wikiPathStop.setDepartureTime(stop.getDepTime());
                        System.out.println("set times in json");
                    }
                    break;
            }
        }


        path.add(wikiPathStop);
    }

    @RequestMapping(value = "/api/documentation", method = RequestMethod.GET)
    public String getApiDocumentation() {
        return "TODO: DOCUMENTATION PAGE"; //TODO: Doc-page
    }

    @RequestMapping(value = "/api/documentation/pages", method = RequestMethod.GET)
    public String getApiDocumentationPages() {
        return "TODO: DOCUMENTATION PAGE LIST"; //TODO: Doc-page
    }

    @RequestMapping(value = "/api/documentation/page/{id}", method = RequestMethod.GET)
    public String getApiDocumentationPage(@PathVariable("id") int id) {
        return "TODO: DOCUMENTATION PAGE" + id; //TODO: Doc-page
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {

        return "index.html";
    }

}
