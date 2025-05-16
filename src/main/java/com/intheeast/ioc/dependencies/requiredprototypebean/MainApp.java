package com.intheeast.ioc.dependencies.requiredprototypebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependencies.requiredprototypebean.config.ConfigApp;
import com.intheeast.ioc.dependencies.requiredprototypebean.service.SingletonBean;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(ConfigApp.class);
		
		SingletonBean single = (SingletonBean) context.getBean("singletonBean");
		single.doExcute();
		single.doExcute();
		single.doExcute();
	}

}
