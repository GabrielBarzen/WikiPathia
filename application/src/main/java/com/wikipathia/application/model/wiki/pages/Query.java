
package com.wikipathia.application.model.wiki.pages;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Query {


    @SerializedName("geosearch")
    @Expose
    private List<Geosearch> geosearch = null;

    public List<Geosearch> getGeosearch() {
        return geosearch;
    }

    public void setGeosearch(List<Geosearch> geosearch) {
        this.geosearch = geosearch;
    }

}
