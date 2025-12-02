package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import jakarta.annotation.PostConstruct;

public class ExampleBean {

    private String message;

    public ExampleBean(String message) {
        this.message = message;
    }
    
    @PostConstruct
    public void init() {
    	System.out.println();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExampleBean{message='" + message + "'}";
    }
}
