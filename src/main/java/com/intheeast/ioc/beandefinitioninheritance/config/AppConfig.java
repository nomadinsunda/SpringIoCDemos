package com.intheeast.ioc.beandefinitioninheritance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.beandefinitioninheritance.model.AnotherChildBean;
import com.intheeast.ioc.beandefinitioninheritance.model.ChildBean;

@Configuration
public class AppConfig {

    @Bean
    public ChildBean childBean() {
        ChildBean child = new ChildBean();
        child.setName("Parent Name");
        child.setAge(50);
        child.setAdditionalProperty("Child-specific Property");
        return child;
    }

    @Bean
    public AnotherChildBean anotherChildBean() {
        AnotherChildBean anotherChild = new AnotherChildBean();
        anotherChild.setName("Parent Name");
        anotherChild.setAge(50);
        return anotherChild;
    }
}