package com.intheeast.ioc.environmentabstraction.placeholderresolutioninstatements.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import com.intheeast.ioc.environmentabstraction.placeholderresolutioninstatements.domain.ConfigClass;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${customer}")
    private String customer;

    @Bean
    public ConfigClass config(Environment environment) {
        // customer = "acme" 라면 다음처럼 경로 구성
        String resourcePath = "com/bank/service/" + customer + "-config.xml";
        return new ConfigClass(resourcePath);
    }
    
//    @SuppressWarnings("deprecation")
//	@Bean
//    public PropertySourcesPlaceholderConfigurer propertyConfigure() {
//    	PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = 
//    			new PropertyPlaceholderConfigurer();
//    	Resource location = new ResourceLoader(ClassPath("application.properties"));
//    	propertyPlaceholderConfigurer.setLocation();
//    	
//    	return propertyPlaceholderConfigurer;
//    }
}
