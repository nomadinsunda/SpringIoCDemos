package com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example1.config.AppConfig;
import com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model.ServiceStrategy;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // 서비스 전략 빈 가져오기 및 실행
        ServiceStrategy strategy = context.getBean(ServiceStrategy.class);
        strategy.execute();

        // 컨텍스트 종료
        context.close();
    }
}
