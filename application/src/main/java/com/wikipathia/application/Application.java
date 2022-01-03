package com.wikipathia.application;

import com.wikipathia.application.controller.IndexController;
import com.wikipathia.application.controller.TrafikLabService;
import com.wikipathia.application.controller.WikipediaService;

import com.wikipathia.application.model.trafficlab.Trip;
import com.wikipathia.application.model.wiki.WikipediaPage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		WikipediaService wikiService = new WikipediaService(WebClient.builder());
		TrafikLabService trafService = new TrafikLabService(WebClient.builder());
		//SpringApplication.run(Application.class, args);
		Trip[] trip = trafService.getRouteFromID(740039295,740026031);
		System.out.println("TRIP ----------------------------------------------------------------------> " + trip);
		System.out.println(trip[0].ctxRecon);
		System.out.println(trip[0].LegList[0].Stops[0].name);




	}

}
