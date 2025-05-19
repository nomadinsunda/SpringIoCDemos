package com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model.CustomBeanFactoryPostProcessor;
import com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example2.model.ServiceStrategy;

@Configuration
@PropertySource("classpath:strategy.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    
    @Bean
    public ServiceStrategy serviceStrategy() {
        return new ServiceStrategy();
    }
}
