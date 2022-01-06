
package com.wikipathia.application.model.trafiklab.route;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Product {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("num")
    @Expose
    private String num;
    @SerializedName("catCode")
    @Expose
    private String catCode;
    @SerializedName("catOutS")
    @Expose
    private String catOutS;
    @SerializedName("catOutL")
    @Expose
    private String catOutL;
    @SerializedName("operatorCode")
    @Expose
    private String operatorCode;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("operatorUrl")
    @Expose
    private String operatorUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public String getCatOutS() {
        return catOutS;
    }

    public void setCatOutS(String catOutS) {
        this.catOutS = catOutS;
    }

    public String getCatOutL() {
        return catOutL;
    }

    public void setCatOutL(String catOutL) {
        this.catOutL = catOutL;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorUrl() {
        return operatorUrl;
    }

    public void setOperatorUrl(String operatorUrl) {
        this.operatorUrl = operatorUrl;
    }

}
