package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model.AnotherExampleBean;
import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model.ExampleBean;
import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model.LifecycleBean;

@Configuration
public class AppConfig {

    @Bean(destroyMethod = "cleanup")
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

    @Bean
    public AnotherExampleBean anotherExampleBean() {
        return new AnotherExampleBean();
    }

    @Bean
    public LifecycleBean lifecycleBean() {
        return new LifecycleBean();
    }
}
