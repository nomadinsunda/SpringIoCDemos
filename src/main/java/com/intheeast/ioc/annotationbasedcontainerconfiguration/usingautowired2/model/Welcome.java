package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Welcome {
	
	private Hello hello;
	
	@Autowired
	public void setHello(@Nullable Hello hello) {
		if (hello != null)
			this.hello = hello;
		else 
			System.out.println("setHello method: 1st arg is null");
	}

}
