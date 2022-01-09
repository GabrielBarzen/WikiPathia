
package com.wikipathia.application.model.trafiklab.route;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Trip {

    @SerializedName("LegList")
    @Expose
    private LegList legList;
    @SerializedName("idx")
    @Expose
    private Integer idx;
    @SerializedName("tripId")
    @Expose
    private String tripId;
    @SerializedName("duration")
    @Expose
    private String duration;

    public LegList getLegList() {
        return legList;
    }

    public void setLegList(LegList legList) {
        this.legList = legList;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
