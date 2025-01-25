package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example1.model.CustomBeanPostProcessor;
import com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example1.model.SimpleBean;

@Configuration
public class AppConfig {

    @Bean
    public static CustomBeanPostProcessor beanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean("Hello, BeanPostProcessor!");
    }
}
