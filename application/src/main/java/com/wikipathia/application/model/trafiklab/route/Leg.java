
package com.wikipathia.application.model.trafiklab.route;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Leg {

    @SerializedName("Origin")
    @Expose
    private Origin origin;
    @SerializedName("Destination")
    @Expose
    private Destination destination;
    @SerializedName("Stops")
    @Expose
    private Stops stops;
    @SerializedName("idx")
    @Expose
    private String idx;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("transportNumber")
    @Expose
    private String transportNumber;
    @SerializedName("transportCategory")
    @Expose
    private String transportCategory;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("reachable")
    @Expose
    private Boolean reachable;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("dist")
    @Expose
    private Integer dist;

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Stops getStops() {
        return stops;
    }

    public void setStops(Stops stops) {
        this.stops = stops;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getTransportCategory() {
        return transportCategory;
    }

    public void setTransportCategory(String transportCategory) {
        this.transportCategory = transportCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getReachable() {
        return reachable;
    }

    public void setReachable(Boolean reachable) {
        this.reachable = reachable;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

}
