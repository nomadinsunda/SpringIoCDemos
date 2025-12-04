package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired2.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.close();

	}

}
