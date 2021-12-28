package com.wikipathia.application;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.wikipathia.application.controller.WikipediaService;
import com.wikipathia.application.model.Stop;
import com.wikipathia.application.model.WikipediaGson;
import com.wikipathia.application.model.WikipediaPage;
import com.wikipathia.application.model.WikipediaPages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		WikipediaService service = new WikipediaService(WebClient.builder());

		List<WikipediaPage> list = service.getWikipediaPagesFromCoordinates(59.3293, 18.0686);
		for (WikipediaPage page: list) {
			System.out.println(page.pageid);
		}
		//SpringApplication.run(Application.class, args);
	}

}
