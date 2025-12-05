package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.TransferService;
import com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.TransferServiceImpl;

@Configuration
public class ServiceConfig {

	@Autowired
	private RepositoryConfig repositoryConfig;

	@Bean
	public TransferService transferService() {
		return new TransferServiceImpl(repositoryConfig.accountRepository());
	}
}