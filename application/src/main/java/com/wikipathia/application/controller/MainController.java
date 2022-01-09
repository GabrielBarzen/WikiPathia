package com.wikipathia.application.controller;

import org.springframework.web.reactive.function.client.WebClient;

/**
 * Main Controller class of this application. Creates the two main service-classes WikipediaService and TrafikLabService.
 */
public class MainController {

    private static WikipediaService wikiService;
    private static TrafikLabService trafikLabService;

    /**
     * Constructor, creates both static service-classes.
     * @param args
     */
    public MainController(String[] args){
        wikiService = new WikipediaService(WebClient.builder());
        trafikLabService = new TrafikLabService(WebClient.builder());
    }

    public static WikipediaService getWikiService() {
        return wikiService;
    }
    public static TrafikLabService getTrafikLabService() {
        return trafikLabService;
    }

}
