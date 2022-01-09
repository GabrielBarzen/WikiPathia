package com.wikipathia.application;

import com.wikipathia.application.controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Class used to start backend part of this Spring Application.
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new MainController(args);
		SpringApplication.run(Application.class, args);
	}

}
