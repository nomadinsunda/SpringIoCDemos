package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Application is running...");

        // 컨텍스트를 종료하여 정지(stop) 콜백을 실행
        context.close();
    }

}
