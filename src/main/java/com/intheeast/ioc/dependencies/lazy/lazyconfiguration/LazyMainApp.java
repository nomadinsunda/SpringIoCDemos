package com.intheeast.ioc.dependencies.lazy.lazyconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependencies.lazy.lazyconfiguration.config.LazyConfiguration;
import com.intheeast.ioc.dependencies.lazy.lazyconfiguration.service.FirstService;
import com.intheeast.ioc.dependencies.lazy.lazyconfiguration.service.SecondService;

public class LazyMainApp {
    public static void main(String[] args) {
        System.out.println("=== ApplicationContext 초기화 ===");
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(LazyConfiguration.class);

        System.out.println("=== 빈을 가져오기 전까지 LazyService는 초기화되지 않음 ===");

        // 여기서 LazyService를 처음 요청하므로 그때 초기화됨
        LazyConfiguration.LazyService lazyService = context.getBean(LazyConfiguration.LazyService.class);

        System.out.println("=== LazyService 메서드 호출 ===");
        lazyService.doWork();
        
        System.out.println("\n=== FirstService Bean 요청 ===");
        FirstService firstService = context.getBean(FirstService.class);
        firstService.doSomething();

        System.out.println("\n=== SecondService Bean 요청 ===");
        SecondService secondService = context.getBean(SecondService.class);
        secondService.doAnotherThing();
    }
}