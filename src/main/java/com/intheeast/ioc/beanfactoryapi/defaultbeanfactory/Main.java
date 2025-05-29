package com.intheeast.ioc.beanfactoryapi.defaultbeanfactory;

import java.io.ObjectInputFilter.Config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Main {

	public static void main(String[] args) {

		AppConfig config = new AppConfig();
		DefaultListableBeanFactory factory =
				config.createBeanFactory();
		

		
		Printer print = 
				(Printer) factory.getBean("printer");
		print.print("hello World");
		
		HelloService hello = 
				(HelloService) factory.getBean("helloservice");
		hello.sayHello();
		
		return;
	}

}
