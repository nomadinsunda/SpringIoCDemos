package com.intheeast.ioc.containeroverview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class, DaoConfig.class})
public class AppConfig {
    // 통합된 설정을 위한 기본 구성 클래스
}