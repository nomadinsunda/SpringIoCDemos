package com.intheeast.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.intheeast.ioc.beanoverview.examples.PrototypeBean;
import com.intheeast.ioc.beanoverview.service.SingleTonType;

@Configuration
public class ScopeConfig {
	
	// scope : 디폴트로 singleton, prototype, ...
	
	@Bean
	public SingleTonType singleTonType() {
		return new SingleTonType();
	}

    @Bean
    @Scope("prototype") // 프로토타입 스코프
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}

