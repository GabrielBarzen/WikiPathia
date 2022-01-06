
package com.wikipathia.application.model.wiki.pages;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class WikipediaPages {


    @SerializedName("query")
    @Expose
    private Query query;


    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

}
