
package com.wikipathia.application.model.trafiklab.route;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Stops {

    @SerializedName("Stop")
    @Expose
    private List<Stop> stop = null;

    public List<Stop> getStop() {
        return stop;
    }

    public void setStop(List<Stop> stop) {
        this.stop = stop;
    }

}
