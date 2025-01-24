package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety.model.ExampleSingletonBean;

@Configuration
public class AppConfig {

    @Bean
    public ExampleSingletonBean exampleSingletonBean() {
        return new ExampleSingletonBean();
    }
}

