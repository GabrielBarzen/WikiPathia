
package com.wikipathia.application.model.trafiklab.route;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Route {

    @SerializedName("Trip")
    @Expose
    private List<Trip> trip = null;
    @SerializedName("scrB")
    @Expose
    private String scrB;
    @SerializedName("scrF")
    @Expose
    private String scrF;

    public List<Trip> getTrip() {
        return trip;
    }

    public void setTrip(List<Trip> trip) {
        this.trip = trip;
    }

    public String getScrB() {
        return scrB;
    }

    public void setScrB(String scrB) {
        this.scrB = scrB;
    }

    public String getScrF() {
        return scrF;
    }

    public void setScrF(String scrF) {
        this.scrF = scrF;
    }

}
