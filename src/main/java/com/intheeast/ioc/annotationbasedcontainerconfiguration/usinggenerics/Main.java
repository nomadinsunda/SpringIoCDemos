package com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.config.AppConfig;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.service.StoreService;


public class Main {
    public static void main(String[] args) {
    	//String hello = "hello";
    	//String world = hello;

        // 스프링 컨텍스트 초기화 (Java Config)
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // StoreService 가져오기
        StoreService storeService = context.getBean(StoreService.class);
        storeService.testStores();

        context.close();
    }
}
