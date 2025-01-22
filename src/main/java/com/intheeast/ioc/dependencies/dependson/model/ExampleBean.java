package com.intheeast.ioc.dependencies.dependson.model;

public class ExampleBean {
    private ManagerBean manager;    
    

    public ExampleBean() {
		System.out.println("ExampleBean Default Contructor");
	}

	public void setManager(ManagerBean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ExampleBean initialized with ManagerBean: " + (manager != null);
    }
}