package com.intheeast.ioc.dependencies.lazy.model;

public class ExpensiveToCreateBean {
    public ExpensiveToCreateBean() {
        System.out.println("ExpensiveToCreateBean initialized");
    }
}