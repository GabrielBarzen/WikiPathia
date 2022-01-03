package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.wikipathia.application.model.wiki.WikipediaPage;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class WikipediaService {

    private final WebClient client;

    public WikipediaService(WebClient.Builder webClientBuilder) {
        this.client = webClientBuilder.baseUrl("https://en.wikipedia.org/w").build();
    }
    public List<WikipediaPage> getWikipediaPagesFromCoordinates(double lat, double lon, int radius) {
        return getWikipediaPagesFromCoordinates(lat,lon,radius,100);
    }
    public List<WikipediaPage> getWikipediaPagesFromCoordinates(double lat, double lon) {
        return getWikipediaPagesFromCoordinates(lat,lon,10000,100);
    }

        public List<WikipediaPage> getWikipediaPagesFromCoordinates(double lat, double lon, int radius, int limit) {
        String string = this.client.get().uri("/api.php?action=query&generator=geosearch&prop=coordinates|pageimages&ggscoord={lat}|{lon}&format=json&gsradius={radius}&gslimit={limit}", lat,lon,radius,limit)
                .retrieve().bodyToMono(String.class).block();


        JsonElement jsonElement = JsonParser.parseString(string);
        System.out.println(jsonElement);


        JsonElement pages = jsonElement.getAsJsonObject().get("query").getAsJsonObject().get("pages");

        Set<Map.Entry<String, JsonElement>> entrySet = pages.getAsJsonObject().entrySet();

        for(Map.Entry<String,JsonElement> entry : entrySet){

        }

        List<WikipediaPage> wikiPages = new ArrayList<>();
        Gson gson = new Gson();

        for (Map.Entry<String,JsonElement> entry : entrySet) {
            WikipediaPage page = gson.fromJson(entry.getValue(),WikipediaPage.class);
            wikiPages.add(page);
        }


        return wikiPages;
    }
}
