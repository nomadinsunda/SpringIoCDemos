package com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.config.AppConfigNoProxy;
import com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.config.AppConfigProxy;
import com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.service.B;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("▶▶▶ @Configuration (proxyBeanMethods = true) 테스트");
		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfigProxy.class)) {
			
//			B b1 = ctx.getBean(B.class);
//			B b2 = ctx.getBean(B.class);
//			System.out.println("B1 == B2? " + (b1 == b2));
//			
//			ctx.close();
		}

		System.out.println("\n▶▶▶ @Configuration (proxyBeanMethods = false) 테스트");
		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfigNoProxy.class)) {
//			B b1 = ctx.getBean(B.class);
//			B b2 = ctx.getBean(B.class);
//			System.out.println("B1 == B2? " + (b1 == b2));
		}
	}

}
