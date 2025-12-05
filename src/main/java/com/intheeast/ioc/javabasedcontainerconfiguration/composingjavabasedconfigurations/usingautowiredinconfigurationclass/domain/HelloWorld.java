package com.intheeast.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {	
	
	private final AccountRepository accountRepository;

//	public TransferServiceImpl() {
//		System.out.println("✅ TransferServiceImpl 생성됨");
//	}
	
//	@Autowired
	public HelloWorld(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		System.out.println("✅ TransferServiceImpl 생성됨");
	}


}
