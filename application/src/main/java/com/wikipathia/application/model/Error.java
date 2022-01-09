package com.wikipathia.application.model;

import java.util.List;

public class Error {
    private String error;
    private String description;
    private List<ParameterError> parameter_error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ParameterError> getParameter_error() {
        return parameter_error;
    }

    public void setParameter_error(List<ParameterError> parameter_error) {
        this.parameter_error = parameter_error;
    }
}
