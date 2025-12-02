package com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example3.config.DataSourceConfig;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		
		context.close();

	}

}
