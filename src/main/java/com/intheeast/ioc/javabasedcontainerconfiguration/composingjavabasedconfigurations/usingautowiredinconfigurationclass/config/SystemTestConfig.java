package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;


import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import jakarta.annotation.PostConstruct;

import java.sql.Driver;

import javax.sql.DataSource;

@Configuration
@Import({ProcessorConfig.class, ServiceConfig.class, RepositoryConfig.class})
public class SystemTestConfig {
	
	public SystemTestConfig() {
		System.out.println("✅ SystemTestConfig Default Constructor");
	}

	@SuppressWarnings("unchecked")
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource ds = new SimpleDriverDataSource();
		try {
			ds.setDriverClass((Class<? extends Driver>) Class.forName("com.mysql.cj.jdbc.Driver"));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("MySQL 드라이버를 찾을 수 없습니다.", e);
		}
		
		ds.setUrl("jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul");
		ds.setUsername("root");
		ds.setPassword("1234");

		System.out.println("✅ SimpleDriverDataSource 등록 완료");
		return ds;
	}
	
	@PostConstruct
    public void init() {
        // 이 메서드 내에서 동일한 구성 클래스의 비정적 @Bean 메서드에 접근하지 마세요
        // 예: dataSource(); (비정적 메서드 접근 금지)
        System.out.println("✅ SystemTestConfig initialized");
    }
}
