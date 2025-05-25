package com.intheeast.ioc.usingjsr330.inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.usingjsr330.inject.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
