package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.config.AppConfig;
public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.start(); // start 메서드를 호출해야 LifeCycleService의 start 메서드가 호출됨
//		context.
//		
//		
//		context.stop();
		
		context.close();
	}

}
