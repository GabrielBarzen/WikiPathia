
package com.wikipathia.application.model.wiki.pages;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Query {


    @SerializedName("geoSearch")
    @Expose
    private List<Geosearch> geosearches = null;

    public List<Geosearch> getGeosearch() {
        return geosearches;
    }

    public void setGeosearch(List<Geosearch> geosearch) {
        this.geosearches = geosearch;
    }

}
