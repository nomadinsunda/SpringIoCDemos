package com.intheeast.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/*
 디폴트 필터는 애너테이션에서 useDefaultFilters=false로 설정하여 비활성화할 수 있습니다. 
 이는 @Component, @Repository, @Service, @Controller, @RestController, @Configuration로 
 애너테이션되거나 메타 애너테이션된 클래스의 자동 감지를 효과적으로 비활성화합니다.
 */
@Configuration
@ComponentScan(
        basePackages = "com.intheeast.ioc.classpathscanningandmanagedcomponents",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier.Offline.class),
//        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Repository"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Comedy.*Repository"),
        scopeResolver = MyScopeResolver.class
)
public class AppConfig {
	
	
	
	
	
}
