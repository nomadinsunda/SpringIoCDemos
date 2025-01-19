package com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators.service.AccountService;

@Configuration
public class ParentConfig {

    @Bean
    public AccountService accountService() {
        return new AccountService(); // 부모 컨텍스트에서 정의된 AccountService
    }
}