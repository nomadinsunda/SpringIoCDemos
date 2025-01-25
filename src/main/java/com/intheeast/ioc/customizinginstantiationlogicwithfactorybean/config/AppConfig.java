package com.intheeast.ioc.customizinginstantiationlogicwithfactorybean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizinginstantiationlogicwithfactorybean.model.CustomObjectFactoryBean;

@Configuration
public class AppConfig {

    @Bean
    public CustomObjectFactoryBean customObjectFactoryBean() {
        return new CustomObjectFactoryBean();
    }
}
