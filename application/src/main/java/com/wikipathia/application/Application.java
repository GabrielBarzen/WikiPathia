package com.wikipathia.application;

import com.wikipathia.application.controller.TrafikLabService;
import com.wikipathia.application.controller.WikipediaService;
import com.wikipathia.application.model.trafficlab.Route;
import com.wikipathia.application.model.wiki.WikipediaPage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		WikipediaService wikiService = new WikipediaService(WebClient.builder());
		TrafikLabService trafService = new TrafikLabService(WebClient.builder());

		Route route = trafService.getRouteFromCoordinates(59.293611 ,18.083056,56.0465, 12.6845);
		System.out.println("Origin : " + route.origin);
		System.out.println("Destination : " + route.destination);




	}

}
