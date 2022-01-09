package com.wikipathia.application.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for serving index.html.
 */
@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {

        return "index.html";
    }

}
