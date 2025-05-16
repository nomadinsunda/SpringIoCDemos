package com.intheeast.ioc.dependencies.lazy.lazyconfiguration.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class FirstService {
    public FirstService() {
        System.out.println("[FirstService] Constructor called");
    }

    // CallBack 메서드 : 여기서 Back은 Spring IoC 컨테이너를 의미
    //                 초기화 콜백 메서드...
    @PostConstruct
    public void init() {
    	
        System.out.println("[FirstService] @PostConstruct initialization logic executed");
    }

    public void doSomething() {
        System.out.println("[FirstService] Doing something...");
    }
}