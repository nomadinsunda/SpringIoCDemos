package com.intheeast.ioc.circulardependencies.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.circulardependencies.service.ClassA;
import com.intheeast.ioc.circulardependencies.service.ClassB;

@Configuration
public class AppConfig {

    @Bean
    public ClassA classA(ClassB classB) {
        return new ClassA(classB);
    }

    @Bean
    public ClassB classB(ClassA classA) {
        return new ClassB(classA);
    }
}