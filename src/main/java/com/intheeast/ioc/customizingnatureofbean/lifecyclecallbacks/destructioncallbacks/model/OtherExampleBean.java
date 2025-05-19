package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.destructioncallbacks.model;

import jakarta.annotation.PreDestroy;

public class OtherExampleBean {
	
	@PreDestroy
	public void destroy() {
		System.out.println("OtherExampleBean:destroy");
	}

}
