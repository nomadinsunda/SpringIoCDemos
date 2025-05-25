package com.intheeast.ioc.javabasedcontainerconfiguration.basicconcepts.service;

public class B {

	private final A a;

	public B(A a) {
		this.a = a;
		System.out.println("B 인스턴스 생성됨: A = " + a);
	}
}
