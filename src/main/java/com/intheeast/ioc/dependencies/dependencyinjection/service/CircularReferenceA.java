package com.intheeast.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularReferenceA {

	private CircularReferenceB crb;
	
	@Autowired
	public CircularReferenceA(CircularReferenceB crb) {
		this.crb = crb;
	}
	
	public CircularReferenceB getCrb() {
		return this.crb;
	}
}
