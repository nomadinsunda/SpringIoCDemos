package com.intheeast.ioc.customizingnatureofbean.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.intheeast.ioc.customizingnatureofbean.beanpostprocessor.config.AppConfig;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.close();

	}

}
