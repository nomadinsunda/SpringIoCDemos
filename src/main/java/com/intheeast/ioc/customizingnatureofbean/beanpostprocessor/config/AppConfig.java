package com.intheeast.ioc.customizingnatureofbean.beanpostprocessor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 현재 프로젝트에 어노테이션 기반 구성 메타데이터(@Component, @Service, @Repository...)가 있으니 찾아서 빈으로 등록해라
// 스캔 범위는 다음과 같다
@ComponentScan({"com.intheeast.ioc.customizingnatureofbean.beanpostprocessor.model"})
public class AppConfig {

}
