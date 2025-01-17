package com.intheeast.ioc.dependenciesandconfigurationindetail.straightvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependenciesandconfigurationindetail.straightvalues.config.AppConfig;

public class MainApplication {
	
	public static void main(String[] args) {		
	
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
	}
}