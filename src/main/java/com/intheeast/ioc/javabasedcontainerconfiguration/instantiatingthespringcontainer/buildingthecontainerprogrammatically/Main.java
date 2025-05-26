package com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.config.*;
import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.service.MyService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext();
		
		ctx.register(AppConfig.class, OtherConfig.class);
		ctx.register(AdditionalConfig.class);
		ctx.refresh(); // refresh 호출해야만 config 클래스에서 게시된 빈들이 생성/등록된다.

		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
	}
}