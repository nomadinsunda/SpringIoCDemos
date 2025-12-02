package com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean.model.CustomObjectFactoryBean;


@Configuration
public class AppConfig {

    @Bean
    public CustomObjectFactoryBean customObjectFactoryBean() {
        return new CustomObjectFactoryBean();
    }
}
