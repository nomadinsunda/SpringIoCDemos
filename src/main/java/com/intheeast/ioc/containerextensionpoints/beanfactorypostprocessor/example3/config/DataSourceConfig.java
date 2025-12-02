package com.intheeast.ioc.containerextensionpoints.beanfactorypostprocessor.example3.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@PropertySource("classpath:com/something/jdbc.properties")
public class DataSourceConfig {

    // 2. @Value를 사용하여 플레이스홀더 값을 주입받습니다.
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() throws ClassNotFoundException {
        // BasicDataSource를 사용한다고 가정
    	SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        // 3. 치환된 값을 사용하여 Bean 속성을 설정합니다.
    	dataSource.setDriverClass((Class<? extends java.sql.Driver>) Class.forName(driverClassName));
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}