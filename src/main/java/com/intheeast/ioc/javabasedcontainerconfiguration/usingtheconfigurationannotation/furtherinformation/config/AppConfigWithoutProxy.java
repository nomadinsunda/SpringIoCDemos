package com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config;


import org.springframework.context.annotation.*;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

@Configuration(proxyBeanMethods = false)
public class AppConfigWithoutProxy {

	@Bean
	public ClientDao clientDao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService clientService1() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());  // 일반 호출 → 매번 새 인스턴스 가능성 있음
		return service;
	}

	@Bean
	public ClientService clientService2() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}
}
