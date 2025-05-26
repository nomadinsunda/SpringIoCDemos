package com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.service.A;
import com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.service.B;

@Configuration//(proxyBeanMethods=true)  // proxyBeanMethods = true (기본값)
public class AppConfigProxy {

	@Bean
	public A a() {
		System.out.println("Called a()");
		return new A();
	}

	@Bean
	public B b() {
		System.out.println("Called b()");
		return new B(a());  // a()는 프록시를 통해 호출 -> 싱글톤 A 인스턴스 주입
	}
}