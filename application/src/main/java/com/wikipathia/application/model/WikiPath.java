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

    private int tripOriginID;
    private int tripDestinationID;
    private int ID;

    public void setWikiPath(List<WikiPathStop> wikiPath) {
        this.wikiPath = wikiPath;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTripOriginID() {
        return tripOriginID;
    }

    public void setTripOriginID(int tripOriginID) {
        this.tripOriginID = tripOriginID;
    }

    public int getTripDestinationID() {
        return tripDestinationID;
    }

    public void setTripDestinationID(int tripDestinationID) {
        this.tripDestinationID = tripDestinationID;
    }
}
