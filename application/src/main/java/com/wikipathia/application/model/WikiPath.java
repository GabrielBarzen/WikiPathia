package com.wikipathia.application.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class to represent a collection of stops and related Wikipedia articles.
 */
public class WikiPath {

    private List<WikiPathStop> wikiPath = new ArrayList<>();

    public void add(WikiPathStop stop) {
        wikiPath.add(stop);
    }

    public List<WikiPathStop> getStops() {
        return wikiPath;
    }


}
