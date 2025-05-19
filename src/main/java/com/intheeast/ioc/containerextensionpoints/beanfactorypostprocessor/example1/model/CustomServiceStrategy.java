package com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model;

public class CustomServiceStrategy extends ServiceStrategy {

    @Override
    public void execute() {
//    	super.execute();
        System.out.println("Executing custom ServiceStrategy.");
    }
}
