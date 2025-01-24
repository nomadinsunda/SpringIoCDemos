package com.intheeast.ioc.beandefinitioninheritance.model;

public abstract class AbstractBean {
    private String name;
    private int age;

    // 공통 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
