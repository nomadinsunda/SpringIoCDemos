package com.intheeast.ioc.componentconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.componentconfig.config.AppConfig;
import com.intheeast.ioc.componentconfig.config.FactoryMethodComponent;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(FactoryMethodComponent.class);
		
		ctx.close();
	}

}
