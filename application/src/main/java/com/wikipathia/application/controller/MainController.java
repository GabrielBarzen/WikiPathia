package com.wikipathia.application.controller;

import com.wikipathia.application.Application;
import com.wikipathia.application.model.trafiklab.route.Route;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;


public class MainController {

    private static WikipediaService wikiService;
    private static TrafikLabService trafikLabService;

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
