package com.intheeast.ioc.dependencies.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependencies.lazy.config.AppConfig;

public class Main {
	
	public static void xxx() {
		int a = 0;
		a = 3;
	}
	
    public static void main(String[] args) {
    	
    	//a = 4;
    	
        System.out.println("Initializing ApplicationContext...");
        
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Retrieving AnotherBean...");
        context.getBean("notLazyBean");

        System.out.println("Retrieving ExpensiveToCreateBean...");
        context.getBean("lazyBean");
    }
}