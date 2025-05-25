package com.intheeast.ioc.usingjsr330.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.usingjsr330.provider.service.SimpleMovieLister;

@Configuration
@ComponentScan({"com.intheeast.ioc.usingjsr330.provider"})
public class AppConfig {

	@Bean
	public SimpleMovieLister simpleMoviewLister() {
		return new SimpleMovieLister();
	}
}
