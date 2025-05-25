package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain.*;

@Configuration
public class ServiceConfig {

	@Autowired
	private AccountRepository accountRepository;  // RepositoryConfig에서 주입됨

	@Bean
	public TransferService transferService() {
		return new TransferServiceImpl(accountRepository);
	}
}
