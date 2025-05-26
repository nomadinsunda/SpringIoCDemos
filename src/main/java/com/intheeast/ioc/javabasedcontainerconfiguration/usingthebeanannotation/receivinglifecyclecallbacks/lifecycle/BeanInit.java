package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;

public class BeanInit implements InitializingBean {
	public BeanInit() {
		System.out.println("1️. BeanInit 생성자 호출");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("2. BeanInit:init!!!");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("3. BeanInit - InitializingBean.afterPropertiesSet()");
	}

	public void customInit() {
		System.out.println("4. BeanInit - 사용자 정의 init-method 실행");
	}
}
