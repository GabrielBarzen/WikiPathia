package com.wikipathia.application.model;

import com.wikipathia.application.model.trafiklab.route.Stops;
import com.wikipathia.application.model.wiki.pages.WikipediaPages;

import java.util.ArrayList;
import java.util.List;

public class WikiPath {

    private List<WikiPathStop> wikiPath = new ArrayList<>();


    public void add(WikiPathStop stop) {
        wikiPath.add(stop);
    }

    public List<WikiPathStop> getStops() {
        return wikiPath;
    }


}
