package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.config.AppConfig;
import com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.shutdowngracefully.model.ExampleService;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        ConfigurableApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // Shutdown Hook 등록
        context.registerShutdownHook();

        // 애플리케이션 로직 실행
        ExampleService service = context.getBean(ExampleService.class);
        service.doWork();

        System.out.println("Application is running...");

        // 컨텍스트를 명시적으로 닫지 않아도 종료 시 자동으로 호출됩니다.
        context.close();
    }
}
