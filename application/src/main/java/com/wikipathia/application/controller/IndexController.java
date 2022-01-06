package com.wikipathia.application.controller;
import com.google.gson.Gson;
import com.wikipathia.application.model.trafiklab.route.*;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @RequestMapping(value = "/stops", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTest() {
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
    public String getRouteArticles(@RequestParam(required = true, name = "originID")int originId, @RequestParam(required = true, name = "destinationID") int destinationId) {
        TrafikLabService trafikLabService = MainController.getTrafikLabService();
        WikipediaService wikipediaService = MainController.getWikiService();

        Route route = trafikLabService.getRouteFromID(originId,destinationId);
        
        ArrayList<WikipediaPages> pageList = new ArrayList<>();
        List<Leg> legs = route.getTrip().get(0).getLegList().getLeg();

        for (int legCount = 0; legCount < legs.size(); legCount++) {

            if (legs.get(legCount).getStops() != null) {
                List<Stop> stops = legs.get(legCount).getStops().getStop();
                for (int stopCount = 0; stopCount < stops.size() - 1; stopCount++) {
                    Stop stop = stops.get(stopCount);
                    double stopLat = stop.getLat();
                    double stopLon = stop.getLon();
                    WikipediaPages page = wikipediaService.getWikipediaPagesFromCoordinates(stopLat, stopLon);
                    page.setQueryLat(stopLat);
                    page.setQueryLon(stopLon);
                    page.setStopName(stop.getName());
                    pageList.add(page);
                }
                if (legCount == legs.size() - 1) {
                    Destination stop = legs.get(legs.size() - 1).getDestination();
                    double stopLat = stop.getLat();
                    double stopLon = stop.getLon();
                    WikipediaPages page = wikipediaService.getWikipediaPagesFromCoordinates(stopLat, stopLon);
                    page.setQueryLat(stopLat);
                    page.setQueryLon(stopLon);
                    page.setStopName(stop.getName());
                    pageList.add(page);
                }
            } else {
                Destination stopDestination = legs.get(legs.size() - 1).getDestination();
                Origin stopOrigin = legs.get(legs.size() - 1).getOrigin();


                    double stopLat = stopOrigin.getLat();
                    double stopLon = stopOrigin.getLon();
                    WikipediaPages page = wikipediaService.getWikipediaPagesFromCoordinates(stopLat, stopLon);
                    page.setQueryLat(stopLat);
                    page.setQueryLon(stopLon);
                    page.setStopName(stopOrigin.getName());
                    pageList.add(page);

                if (legCount == legs.size() - 1) {
                    stopLat = stopDestination.getLat();
                    stopLon = stopDestination.getLon();
                    page = wikipediaService.getWikipediaPagesFromCoordinates(stopLat, stopLon);
                    page.setQueryLat(stopLat);
                    page.setQueryLon(stopLon);
                    page.setStopName(stopOrigin.getName());
                    pageList.add(page);
                }
            }
        }




        /*for (Leg leg : legs) {
            System.out.println("brrrrrrrrrrrrrr");

            if (leg.getStops().getStop() != null) {
                List<Stop> stops = leg.getStops().getStop();

                for (Stop stop : stops) {
                    double stopLat = stop.getLat();
                    double stopLon = stop.getLon();
                    pageList.add(wikipediaService.getWikipediaPagesFromCoordinates(stopLat, stopLon));
                }
            }
        }*/
        Gson gson = new Gson();
        String json = gson.toJson(pageList);


        return json; //TODO: Doc-page
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
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/html/base_template.html"))) {
            String currentLine = "";
            do builder.append(currentLine = reader.readLine());
            while (currentLine != null);
        } catch (Exception e) {
            System.out.println("No such file");
        }
        System.out.println(builder);
        return builder.toString();
    }
}
