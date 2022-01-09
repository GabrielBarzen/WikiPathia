package com.wikipathia.application.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wikipathia.application.model.wiki.pages.Geosearch;
import java.util.List;

/**
 * 
 */
public class WikiPathStop {

    @SerializedName("pages")
    @Expose
    List<Geosearch> pages;

    private String stopName;
    private double queryLat;
    private double queryLon;

    private String departureTime;

    public List<Geosearch> getPages() {
        return pages;
    }

    public void setPages(List<Geosearch> pages) {
        this.pages = pages;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public double getQueryLat() {
        return queryLat;
    }

    public void setQueryLat(double queryLat) {
        this.queryLat = queryLat;
    }

    public double getQueryLon() {
        return queryLon;
    }

    public void setQueryLon(double queryLon) {
        this.queryLon = queryLon;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    private String arrivalTime;


}
