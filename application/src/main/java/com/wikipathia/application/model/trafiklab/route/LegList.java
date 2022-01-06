
package com.wikipathia.application.model.trafiklab.route;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LegList {

    @SerializedName("Leg")
    @Expose
    private List<Leg> leg = null;

    public List<Leg> getLeg() {
        return leg;
    }

    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

}
