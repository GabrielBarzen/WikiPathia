package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WikipediaService {

    private final WebClient client;
    public WikipediaService(WebClient.Builder webClientBuilder) {
        this.client = webClientBuilder.baseUrl("https://sv.wikipedia.org/w").build();
    }
    public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon, int radius) {
        return getWikipediaPagesFromCoordinates(lat,lon,radius,10);
    }
    public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon) {
        return getWikipediaPagesFromCoordinates(lat,lon,10000,10);
    }

        public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon, int radius, int limit) {
        WikipediaPages pages;
        String json = this.client.get().uri("/api.php?format=json&action=query&list=geosearch&gscoord={lat}|{lon}&gsradius={radius}&gslimit={limit}&gsprimary=primary", lat,lon,radius,limit)
                .retrieve().bodyToMono(String.class).block();

        Gson gson = new Gson();
        pages = gson.fromJson(json , WikipediaPages.class);

        System.out.println(gson.toJson(pages));

        return pages;
    }


}
