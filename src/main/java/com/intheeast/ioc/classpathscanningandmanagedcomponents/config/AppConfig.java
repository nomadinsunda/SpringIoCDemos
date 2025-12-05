package com.intheeast.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;

/*
@ComponentScan의 includeFilters 속성은 
@ComponentScan의 스캔 범위내에서 스테레오 타입의 어노테이션이 적용되지 않은 클래스라도 
명시적(explicit)으로 Spring Ioc Container에 등록하기 위해 사용. 
includeFilters는 특정 조건에 맞는 클래스를 필터링해서 스프링 컨테이너에 빈으로 등록할 수 있도록 함.
디폴트로 @ComponentScan은 @Component, @Controller, @Service, @Repository 등을 
붙인 클래스만 자동으로 스캔. 
그러나 includeFilters를 사용하면 이런 애노테이션이 없거나, 
특정 조건을 만족하는 클래스도 스캔 대상으로 강제 포함시킬 수 있음.
 */
@Configuration
@ComponentScan(
        basePackages = "${app.scan.packages}"/*{"com.intheeast.ioc.classpathscanningandmanagedcomponents.controller",
        		"com.intheeast.ioc.classpathscanningandmanagedcomponents.repository",
        		"com.intheeast.ioc.classpathscanningandmanagedcomponents.service"}*/,
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier.Online.class),
//        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Repository"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Comedy.*Repository"),
        scopeResolver = MyScopeResolver.class
)
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	
	
	
	
}
