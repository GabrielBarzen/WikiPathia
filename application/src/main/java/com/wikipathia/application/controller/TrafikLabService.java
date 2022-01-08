package com.wikipathia.application.controller;

import com.google.gson.*;
import com.wikipathia.application.model.trafiklab.route.Route;
import io.netty.util.CharsetUtil;
import org.springframework.http.codec.xml.Jaxb2XmlDecoder;
import org.springframework.http.codec.xml.Jaxb2XmlEncoder;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return key;
    }

    public Route getRouteFromID(int stopIdOrigin, int stopIdDestination) {
        Route routes;


        String routeJson = this.client.get().uri("/trip?format=json&originId={stopIdOrigin}&destId={stopIdDestination}&numF=1&numB=0&key={apiKey}", stopIdOrigin, stopIdDestination, apiKey)
                .retrieve().bodyToMono(String.class).block();


       Gson gson = new Gson();

       routes = gson.fromJson(routeJson, Route.class);
       logJson(routes);

       return routes;
    }

    private void logJson(Route route) {
        String json = new Gson().toJson(route);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("route.json"))) {
            writer.write(json);
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public Route getRouteFromCoordinates(double latOrigin, double lonOrigin, double latDestination, double lonDestination) {
        Route route = new Route();

        String originJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latOrigin}&originCoordLong={lonOrigin}&key={apiKey}" , latOrigin,lonOrigin,apiKey)
                .retrieve().bodyToMono(String.class).block();

        String destinationJSON = this.client.get().uri("/location.nearbystops?format=json&originCoordLat={latDestination}&originCoordLong={lonDestination}&key={apiKey}" , latDestination,lonDestination,apiKey)
                .retrieve().bodyToMono(String.class).block();

        return route;
    }*/ //TODO ifall man pallar
}
