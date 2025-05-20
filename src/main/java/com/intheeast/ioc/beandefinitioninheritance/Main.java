package com.intheeast.ioc.beandefinitioninheritance;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.beandefinitioninheritance.config.BeanInheritanceConfig;
import com.intheeast.ioc.beandefinitioninheritance.model.DerivedTestBean;
import com.intheeast.ioc.beandefinitioninheritance.repository.MyRepository;


public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(BeanInheritanceConfig.class);

        DerivedTestBean bean = context.getBean("inheritsWithDifferentClass", 
        		DerivedTestBean.class);
        System.out.println("✔ name: " + bean.getName());
        System.out.println("✔ age: " + bean.getAge());
        
        BeanDefinition bd = BeanDefinitionBuilder
                .genericBeanDefinition(MyRepository.class)
                .getBeanDefinition();
        context.registerBeanDefinition("myRepo", bd);
        
               
        MyRepository bean2 = context.getBean("myRepo", 
        		MyRepository.class);
        
        System.out.println(bean2);

        context.close();
    }

}
