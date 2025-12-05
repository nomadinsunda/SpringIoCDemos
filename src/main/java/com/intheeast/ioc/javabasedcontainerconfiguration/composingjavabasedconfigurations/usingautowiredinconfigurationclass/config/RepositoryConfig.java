package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.*;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {
	
	public RepositoryConfig() {
		System.out.println("RepositoryConfig:RepositoryConfig");
	}

	// SimpleDriverDataSource가 주입될 것임.
	@Autowired
	private DataSource dataSource;

	@Bean
	public AccountRepository accountRepository(/*DataSource dataSource*/) {
		return new JdbcAccountRepository(dataSource);
	}
	
	
}
