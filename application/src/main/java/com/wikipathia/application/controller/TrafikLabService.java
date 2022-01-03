package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.wikipathia.application.model.trafficlab.Route;
import com.wikipathia.application.model.trafficlab.Stop;
import com.wikipathia.application.model.wiki.WikipediaPage;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrafikLabService {

    private final WebClient client;
    private final String apiKey;

    public TrafikLabService(WebClient.Builder webClientBuilder) {

        apiKey = readKey();
        if (apiKey != null) this.client = webClientBuilder.baseUrl("https://api.resrobot.se/v2/").build();
        else client = null;

    }

    private String readKey() {
        String key = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("keys/key.dat"))){
            key = reader.readLine();
            System.out.println("Key : " + key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    public Route getRouteFromID(int stopIdorigin, int stopIdDestination) {
        Route route = new Route();
        route.origin = stopIdorigin;
        route.destination = stopIdDestination;

        return route;
    }

    public Route getRouteFromCoordinates(double latOrigin, double lonOrigin, double latDestination, double lonDestination) {
        Route route = new Route();

        String originJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latOrigin}&originCoordLong={lonOrigin}&key={apiKey}" , latOrigin,lonOrigin,apiKey)
                .retrieve().bodyToMono(String.class).block();

        String destinationJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latDestination}&originCoordLong={lonDestination}&key={apiKey}" , latDestination,lonDestination,apiKey)
                .retrieve().bodyToMono(String.class).block();

        if(originJSON != null && destinationJSON != null) {
            JsonElement jsonElementOrigin = JsonParser.parseString(originJSON);
            JsonElement jsonElementDestination = JsonParser.parseString(destinationJSON);

            JsonElement origin = jsonElementOrigin.getAsJsonObject().get("StopLocation");
            JsonElement destination = jsonElementDestination.getAsJsonObject().get("StopLocation");

            JsonElement originArray = origin.getAsJsonArray();
            JsonElement destinationArray = destination.getAsJsonArray();

            Gson gson = new Gson();

            Stop[] originStops = gson.fromJson(originArray, Stop[].class);
            Stop[] destinationStops = gson.fromJson(destinationArray, Stop[].class);


            Stop originStop = originStops[0];
            Stop destinationStop = destinationStops[0];

            int routeorigin = originStop.id;
            int routeDest = destinationStop.id;

            route = getRouteFromID(routeorigin, routeDest);

        } else {
            route = null;
        }

        return route;
    }
}
