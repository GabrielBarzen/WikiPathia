package com.wikipathia.application;

import com.wikipathia.application.controller.TrafikLabService;
import com.wikipathia.application.controller.WikipediaService;

import com.wikipathia.application.model.trafiklab.Route;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		WikipediaService wikiService = new WikipediaService(WebClient.builder());
		TrafikLabService trafService = new TrafikLabService(WebClient.builder());
		//SpringApplication.run(Application.class, args);
		Route route = trafService.getRouteFromID(740039295,740026031);
		System.out.println("TRIP ----------------------------------------------------------------------> " + route.getTrip().get(0).getCtxRecon());





	}

}
