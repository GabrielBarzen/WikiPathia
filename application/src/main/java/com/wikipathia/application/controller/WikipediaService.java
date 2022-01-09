package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Main service-class for all communication with the Wikipedia API (Geosearch and Parse Wikitext).
 */
@Service
public class WikipediaService {

    private final WebClient client;

    /**
     * Constructor for this class.
     * @param webClientBuilder used to create the WebClient and connection for Spring Boot.
     */
    public WikipediaService(WebClient.Builder webClientBuilder) {
        this.client = webClientBuilder.baseUrl("https://sv.wikipedia.org/w").build();
    }

    /**
     * Method used to find geotagged Wikipedia articles around specified coordinates.
     * Retrieves relevant json-file and creates model class WikipediaPages.
     * This version is used with default value for limit (10).
     * @param lat specified latitude
     * @param lon specified longitude
     * @param radius radius to search within
     * @return newly created WikipediaPages object from json data
     */
    public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon, int radius) {
        return getWikipediaPagesFromCoordinates(lat,lon,radius,10);
    }

    /**
     * Method used to find geotagged Wikipedia articles around specified coordinates.
     * Retrieves relevant json-file and creates model class WikipediaPages.
     * This version is used with default values for radius (10000 (meters)) and limit (10).
     * @param lat specified latitude
     * @param lon specified longitude
     * @return newly created WikipediaPages object from json data
     */
    public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon) {
        return getWikipediaPagesFromCoordinates(lat,lon,10000,10);
    }

    /**
     * Method used to find geotagged Wikipedia articles around specified coordinates.
     * Retrieves relevant json-file and creates model class WikipediaPages.
     * @param lat specified latitude
     * @param lon specified longitude
     * @param radius radius to search within
     * @param limit number of articles to return
     * @return newly created WikipediaPages object from json data
     */
    public WikipediaPages getWikipediaPagesFromCoordinates(double lat, double lon, int radius, int limit) {
        WikipediaPages pages;
        String json = this.client.get().uri("/api.php?format=json&action=query&list=geosearch&gscoord={lat}|{lon}&gsradius={radius}&gslimit={limit}&gsprimary=primary", lat,lon,radius,limit)
                .retrieve().bodyToMono(String.class).block();

        Gson gson = new Gson();
        pages = gson.fromJson(json , WikipediaPages.class);

        return pages;
    }

    /**
     * Method used to retrieve HTML-document for a specified Wikipedia article.
     * The fetched HTML is used to display contents of a wiki-page on the WikiPathia service.
     * @param id the id of the Wikipedia article
     * @return HTML-document with Wikipedia article content
     */
    public String getWikiHTML(int id) {
        String json = this.client.get().uri("/api.php?action=parse&pageid={id}&prop=text&formatversion=2&format=json", id)
                .retrieve().bodyToMono(String.class).block();

        return json;
    }
}
