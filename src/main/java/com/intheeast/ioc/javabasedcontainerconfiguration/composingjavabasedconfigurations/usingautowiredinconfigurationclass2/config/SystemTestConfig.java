package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass2.config;

import java.sql.Driver;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@Import({ServiceConfig.class, DefaultRepositoryConfig.class})  // import the concrete config!
public class SystemTestConfig {

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource ds = new SimpleDriverDataSource();
		try {
			// Class.forName(com.mysql.cj.jdbc.Driver)
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

}
