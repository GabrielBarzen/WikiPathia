package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.wikipathia.application.model.trafficlab.Route;
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

    public Route getWikipediaPagesFromCoordinates(int stopIdStart, int stopIdDestination) {
        Route route = new Route();


        return null;
    }
}
