package com.intheeast.ioc.customizingnatureofbean.applicationcontextawarebeannameaware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.applicationcontextawarebeannameaware.model.CustomAwareBean;

@Configuration
public class AppConfig {

    @Bean
    public CustomAwareBean customAwareBean() {
        return new CustomAwareBean();
    }
}

