package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.factory.DisposableBean;

public class BeanDestroy implements DisposableBean {
	public BeanDestroy() {
		System.out.println("4. BeanDestroy 생성자 호출");
	}

	@Override
	public void destroy() {
		System.out.println("5️. BeanDestroy - DisposableBean.destroy()");
	}

	public void customDestroy() {
		System.out.println("6️. BeanDestroy - 사용자 정의 destroy-method 실행");
	}
}