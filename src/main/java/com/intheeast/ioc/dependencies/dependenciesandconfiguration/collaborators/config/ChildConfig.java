package com.intheeast.ioc.dependencies.dependenciesandconfiguration.collaborators.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.intheeast.ioc.dependencies.dependenciesandconfiguration.collaborators.service.AccountService;


@Configuration
public class ChildConfig {

    @Bean
    @DependsOn("accountService") // 부모 컨텍스트의 빈에 의존성을 명시
    public ProxyFactoryBean accountServiceProxy(AccountService accountService) {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(accountService); // 부모 컨텍스트의 빈을 참조
        return proxyFactoryBean;
    }
}