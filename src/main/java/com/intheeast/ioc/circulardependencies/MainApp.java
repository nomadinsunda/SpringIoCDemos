package com.intheeast.ioc.circulardependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.circulardependencies.config.AppConfig;



public class MainApp {
	
	public static void main(String[] args) {
        // Load the Spring context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
	
}
