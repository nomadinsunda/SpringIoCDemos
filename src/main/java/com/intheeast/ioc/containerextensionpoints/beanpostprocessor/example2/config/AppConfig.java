package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model.CustomBeanPostProcessor;
import com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model.ExampleBean;
import com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model.OrderedBeanPostProcessor;

@Configuration
@ComponentScan(value={"com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model"})
public class AppConfig {

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
    
//    @Bean
//    public static CustomBeanPostProcessor2 customBeanPostProcessor2() {
//        return new CustomBeanPostProcessor2();
//    }

    @Bean
    public static OrderedBeanPostProcessor orderedBeanPostProcessor() {
        return new OrderedBeanPostProcessor();
    }

    @Bean(initMethod="init")
    public ExampleBean exampleBean() {
        return new ExampleBean("Hello, BeanPostProcessor!");
    }
}
