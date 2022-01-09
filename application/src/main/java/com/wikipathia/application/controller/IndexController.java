package com.wikipathia.application.controller;
import com.google.gson.Gson;
import com.wikipathia.application.model.WikiPath;
import com.wikipathia.application.model.WikiPathStop;
import com.wikipathia.application.model.trafiklab.route.*;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
