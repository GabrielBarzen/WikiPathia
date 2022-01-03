package com.wikipathia.application.controller;
import com.google.gson.Gson;
import com.wikipathia.application.model.trafficlab.Stop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;

@RestController
public class IndexController {


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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {
        StringBuilder current = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader("/html/base_template.html"))) {
            current.append(reader.readLine());
        } catch (Exception e) {

        }

        return current.toString();
    }


}
