package com.intheeast.ioc.dependencies.lazy.lazyconfiguration.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.dependencies.lazy.lazyconfiguration.service.AnotherBean;
import com.intheeast.ioc.dependencies.lazy.lazyconfiguration.service.ExpensiveToCreateBean;

import jakarta.annotation.PostConstruct;


@Configuration
@Lazy  // 이 구성이 적용된 Configuration 클래스 내부의 Bean 들도 Lazy-init 됨
@ComponentScan(basePackages = "com.intheeast.ioc.dependencies.lazy.lazyconfiguration")
public class LazyConfiguration {

	@Bean
    public ExpensiveToCreateBean lazyBean() {
        return new ExpensiveToCreateBean();
    }

    @Bean
    public AnotherBean notLazyBean() {
        return new AnotherBean();
    }
	
    @Component
    @Lazy  // 개별 Bean 에도 @Lazy 설정 가능
    public static class LazyService {
        public LazyService() {
            System.out.println("LazyService Constructor invoked");
        }

        @PostConstruct
        public void init() {
            System.out.println("LazyService initialized");
        }

        public void doWork() {
            System.out.println("LazyService is working...");
        }
    }
}