package com.intheeast.ioc.beanfactoryapi.defaultbeanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class AppConfig {
	
	public DefaultListableBeanFactory createBeanFactory() {
		DefaultListableBeanFactory factory = 
				new DefaultListableBeanFactory();
		
		GenericBeanDefinition printDef = 
				new GenericBeanDefinition();
		printDef.setBeanClass(Printer.class);
		factory.registerBeanDefinition("printer", printDef);
		
		GenericBeanDefinition helloDef = 
				new GenericBeanDefinition();
		helloDef.setBeanClass(HelloService.class);
		helloDef.getPropertyValues().add("printer", factory.getBean("printer"));
		factory.registerBeanDefinition("helloservice", helloDef);
				
		return factory;
		
	}

}
