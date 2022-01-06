package com.wikipathia.application;

import com.wikipathia.application.controller.MainController;
import com.wikipathia.application.controller.TrafikLabService;
import com.wikipathia.application.controller.WikipediaService;

import com.wikipathia.application.model.trafiklab.route.Route;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		MainController controller = new MainController(args);
		SpringApplication.run(Application.class, args);

	}

}
