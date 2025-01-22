package com.intheeast.ioc.dependencies.dependenciesandconfiguration.straightvalues.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class AppConfig {
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Properties properties = new Properties();
        properties.setProperty("jdbc.driver.className", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/sbdt_db");
        configurer.setProperties(properties);
        return configurer;
    }
	
	@Value("${jdbc.driver.className}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Bean
    public DataSource myDataSource() throws ClassNotFoundException {
    	SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
    	
    	dataSource.setDriverClass((Class<? extends java.sql.Driver>) Class.forName(driverClassName));
    	dataSource.setUrl(url);
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }
}