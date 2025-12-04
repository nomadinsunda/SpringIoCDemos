package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.dao.UserDao;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired")
public class AppConfig {
    // 필요한 경우 @Bean 메서드 선언 가능
	// ...
	
	// Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: 
	// Error creating bean with name 'appConfig': 
	//           Unsatisfied dependency expressed through field 'dSource': 
	//           No qualifying bean of type 'javax.sql.DataSource' available: expected at least 1 bean which qualifies as autowire candidate. 
	//            Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
//	@Autowired
//	private DataSource dSource;
	
	@Bean
	public UserDao userDao() {
		UserDao dao = UserDao.builder()
				.id("1234")
				.name("hello")
				.dataSource(dataSource())
				.build();
		
		return dao;
	}
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = 
				new SimpleDriverDataSource();
		
		return dataSource;
	}
}
