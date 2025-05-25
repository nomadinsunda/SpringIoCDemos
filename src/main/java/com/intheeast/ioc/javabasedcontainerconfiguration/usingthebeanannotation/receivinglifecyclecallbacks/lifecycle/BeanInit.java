package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class BeanInit implements InitializingBean {
	public BeanInit() {
		System.out.println("1️. BeanInit 생성자 호출");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("2️. BeanInit - InitializingBean.afterPropertiesSet()");
	}

	public void customInit() {
		System.out.println("3️. BeanInit - 사용자 정의 init-method 실행");
	}
}
