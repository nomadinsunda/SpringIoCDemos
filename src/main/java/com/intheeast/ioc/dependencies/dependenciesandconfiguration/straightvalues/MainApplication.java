package com.intheeast.ioc.dependencies.dependenciesandconfiguration.straightvalues;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependencies.dependenciesandconfiguration.straightvalues.config.AppConfig;


public class MainApplication {
	
	public static void main(String[] args) throws SQLException {		
	
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		DataSource dataSource = context.getBean(DataSource.class);
		
		System.out.println(dataSource.getConnection());
	}
}