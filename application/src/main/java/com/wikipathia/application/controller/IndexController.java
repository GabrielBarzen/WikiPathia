package com.wikipathia.application.controller;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wikipathia.application.model.Stop;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "TODO: INDEX PAGE"; //TODO: index-page
    }

    @RequestMapping(value = "/stops", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTest() {
        ArrayList<Stop> stops = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/static/stops.csv"))) {
            String current;
            reader.readLine();
            while ((current = reader.readLine()) != null) {
                Stop stop = new Stop();
                stop.id = Integer.parseInt(current.split(",")[0]);
                stop.name = current.split(",")[1];
                stops.add(stop);
            }
        } catch (Exception e) {

        }

        Gson gson  = new Gson();
        String json = gson.toJson(stops);


        return json;
    }

    @RequestMapping(value = "/api/documentation", method = RequestMethod.GET)
    public String getApiDocumentation() {
        return "TODO: DOCUMENTATION PAGE"; //TODO: Doc-page
    }

    @RequestMapping(value = "/api/documentation/pages", method = RequestMethod.GET)
    public String getApiDocumentationPages() {
        return "TODO: DOCUMENTATION PAGE LIST"; //TODO: Doc-page
    }

    @RequestMapping(value = "/api/documentation/page/{id}", method = RequestMethod.GET)
    public String getApiDocumentationPage(@PathVariable("id") int id) {
        return "TODO: DOCUMENTATION PAGE" + id; //TODO: Doc-page
    }

}
