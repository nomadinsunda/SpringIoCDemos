package com.intheeast.ioc.beandefinitioninheritance.model;

import lombok.*;

//@Getter
//@Setter
//@Builder
public class DerivedTestBean extends TestBean {
    public void initialize() {
        System.out.println("DerivedTestBean initialized with name=" + getName() + ", age=" + getAge());
    }
}
