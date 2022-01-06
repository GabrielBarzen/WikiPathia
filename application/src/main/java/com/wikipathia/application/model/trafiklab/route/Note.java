
package com.wikipathia.application.model.trafiklab.route;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Note {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("routeIdxFrom")
    @Expose
    private Integer routeIdxFrom;
    @SerializedName("routeIdxTo")
    @Expose
    private Integer routeIdxTo;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    public void setRouteIdxFrom(Integer routeIdxFrom) {
        this.routeIdxFrom = routeIdxFrom;
    }

    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    public void setRouteIdxTo(Integer routeIdxTo) {
        this.routeIdxTo = routeIdxTo;
    }

}
