package com.wikipathia.application.controller;

import com.google.gson.*;
import com.wikipathia.application.model.trafiklab.route.Route;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Main service-class for all communication with the TrafikLab API (ResRobot v2).
 */
@Service
public class TrafikLabService {

    private final WebClient client;
    private final String apiKey;

    /**
     * Constructor for this class. Also reads API-key used for TrafikLab API.
     * @param webClientBuilder used to create the WebClient and connection for Spring Boot.
     */
    public TrafikLabService(WebClient.Builder webClientBuilder) {

        apiKey = readKey();
        if (apiKey != null) this.client = webClientBuilder.baseUrl("https://api.resrobot.se/v2/").build();
        else client = null;

    }

    /**
     * Method used to read API-key for TrafikLab API from key.dat file.
     * @return String with API-key.
     */
    private String readKey() {
        String key = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("keys/key.dat"))){
            key = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    /**
     * Method used to fetch full travel route from Trafiklab API.
     * @param stopIdOrigin TrafikLab id for the starting point of the route, initially fetched from stops.csv
     * @param stopIdDestination TrafikLab id for the final destination of the route, initially fetched from stops.csv
     * @return newly created Route object from json data
     */
    public Route getRouteFromID(int stopIdOrigin, int stopIdDestination) {
        Route routes;

        String routeJson = this.client.get().uri("/trip?format=json&originId={stopIdOrigin}&destId={stopIdDestination}&numF=1&numB=0&key={apiKey}", stopIdOrigin, stopIdDestination, apiKey)
                .retrieve().bodyToMono(String.class).block();


       Gson gson = new Gson();

       routes = gson.fromJson(routeJson, Route.class);
       logJson(routes);

       return routes;
    }

    /**
     * Logging method for the json data fetched from TrafikLab api. Mostly used for debugging the last search made.
     * Logging file is saved to route.json.
     * @param route Route to be logged
     */
    private void logJson(Route route) {
        String json = new Gson().toJson(route);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("route.json"))) {
            writer.write(json);
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
