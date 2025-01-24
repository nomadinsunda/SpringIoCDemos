package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model.CustomLifecycleBean;

@Configuration
public class AppConfig {

    @Bean
    public CustomLifecycleBean lifecycleBean() {
        return new CustomLifecycleBean();
    }

    @Bean
    public CustomLifecycleBean smartLifecycleBean() {
        return new CustomLifecycleBean();
    }
}