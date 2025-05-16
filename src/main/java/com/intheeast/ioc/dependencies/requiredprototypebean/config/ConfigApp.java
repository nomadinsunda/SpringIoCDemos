package com.intheeast.ioc.dependencies.requiredprototypebean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.intheeast.ioc.dependencies.requiredprototypebean.service.PrototypeBean;

@Configuration
@ComponentScan({"com.intheeast.ioc.dependencies.requiredprototypebean"})
public class ConfigApp {

	@Bean
	@Scope("prototype")
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}
}
