package com.wikipathia.application;

import com.google.gson.Gson;
import com.wikipathia.application.model.Stop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Stop stop = new Stop();
		stop.id = 1;
		stop.name ="hej";
		Gson gson = new Gson();
		String json = gson.toJson(stop);
		System.out.println(json);
		SpringApplication.run(Application.class, args);
	}

}
