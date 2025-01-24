package com.intheeast.ioc.beandefinitioninheritance.model;

public class ChildBean extends AbstractBean {
    private String additionalProperty;

    public String getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(String additionalProperty) {
        this.additionalProperty = additionalProperty;
    }
}