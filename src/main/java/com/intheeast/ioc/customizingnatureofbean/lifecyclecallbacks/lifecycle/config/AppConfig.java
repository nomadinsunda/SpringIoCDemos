package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.service.*;

@Configuration
public class AppConfig {
	
	@Bean(destroyMethod="destroy")
	public LifeCycleService lifeCycleService() {
		return new LifeCycleService();
	}

}
