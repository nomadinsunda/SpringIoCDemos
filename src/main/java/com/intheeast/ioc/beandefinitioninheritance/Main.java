package com.intheeast.ioc.beandefinitioninheritance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.beandefinitioninheritance.config.AppConfig;
import com.intheeast.ioc.beandefinitioninheritance.model.AnotherChildBean;
import com.intheeast.ioc.beandefinitioninheritance.model.ChildBean;


public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\nRetrieving ChildBean...");
        ChildBean childBean = context.getBean(ChildBean.class);
        System.out.println(childBean);

        System.out.println("\nRetrieving AnotherChildBean...");
        AnotherChildBean anotherChildBean = context.getBean(AnotherChildBean.class);
        System.out.println(anotherChildBean);

        context.close();
    }

}
