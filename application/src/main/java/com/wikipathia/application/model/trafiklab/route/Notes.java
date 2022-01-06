
package com.wikipathia.application.model.trafiklab.route;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Notes {

    @SerializedName("Note")
    @Expose
    private List<Note> note = null;

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

}
