package com.intheeast.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularReferenceB {
	
	private CircularReferenceA cra;
	
//	public CircularReferenceB(CircularReferenceA cra) {
//		this.cra = cra;
//	}
	
	public CircularReferenceB() {
		int a = 0;
	}
	
	@Autowired
	public void setCra(@Lazy CircularReferenceA cra) {
		this.cra = cra;
	}
	
	public CircularReferenceA getCra() {
		return this.cra;
	}

}
