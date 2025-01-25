package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example1.model;

public class SimpleBean {

    private String message;

    public SimpleBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SimpleBean{message='" + message + "'}";
    }
}
