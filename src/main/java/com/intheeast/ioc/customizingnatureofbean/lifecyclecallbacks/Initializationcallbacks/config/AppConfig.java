package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model.AnotherExampleBean;
import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.Initializationcallbacks.model.ExampleBean;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

    @Bean
    public AnotherExampleBean anotherExampleBean() {
        return new AnotherExampleBean();
    }
}