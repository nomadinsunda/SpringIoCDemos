package com.intheeast.ioc.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.beanscopes.config.AppConfig;
import com.intheeast.ioc.beanscopes.model.DefaultAccountService;
import com.intheeast.ioc.beanscopes.model.SingletonWithPrototype;

public class Main {
	
	public static void main(String[] args) {
        System.out.println("Initializing ApplicationContext...");
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\nRequesting DefaultAccountService (Singleton)...");
        DefaultAccountService singleton1 = context.getBean(DefaultAccountService.class);
        DefaultAccountService singleton2 = context.getBean(DefaultAccountService.class);
        System.out.println("Are singleton instances the same? " + (singleton1 == singleton2));

        // 두 빈간에 협력관계가 없음
//        System.out.println("\nRequesting PrototypeDependency (Prototype)...");
//        Object prototype1 = context.getBean("prototypeDependency");
//        Object prototype2 = context.getBean("prototypeDependency");
//        System.out.println("Are prototype instances the same? " + (prototype1 == prototype2));

        System.out.println("\nUsing SingletonWithPrototype...");
        SingletonWithPrototype singletonWithPrototype = context.getBean(SingletonWithPrototype.class);
        singletonWithPrototype.usePrototype();
        singletonWithPrototype.usePrototype();

        System.out.println("\nClosing ApplicationContext...");
        context.close();
    }

}
