package com.wikipathia.application.controller;

import com.google.gson.Gson;
import com.wikipathia.application.model.trafiklab.route.Stop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
@RestController
public class ApiController {
    @RequestMapping(value = "/stops", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTest() {
        System.out.println("getting stops");
        ArrayList<Stop> stops = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/static/stops.csv"))) {
            String current;
            reader.readLine();
            while ((current = reader.readLine()) != null) {
                Stop stop = new Stop();
                stop.setId(String.valueOf(Integer.parseInt(current.split(",")[0])));
                stop.setName( current.split(",")[1]);
                stops.add(stop);
            }
        } catch (Exception e) {

        }

        Gson gson  = new Gson();
        String json = gson.toJson(stops);

        return json;
    }
}
