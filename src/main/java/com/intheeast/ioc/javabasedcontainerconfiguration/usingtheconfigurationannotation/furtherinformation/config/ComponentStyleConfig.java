package com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client.*;

@Component
public class ComponentStyleConfig {

	@Bean
	public ClientDao clientDao() {
		return new ClientDaoImpl();
	}

	@Bean
	public ClientService clientService1() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}

	@Bean
	public ClientService clientService2() {
		ClientServiceImpl service = new ClientServiceImpl();
		service.setClientDao(clientDao());
		return service;
	}
}
