package com.intheeast.ioc.customizingnatureofbean.beanpostprocessor.model;

import org.springframework.stereotype.Component;

@Component
public class DefaultAccountService {
	
	public DefaultAccountService() {
        System.out.println("DefaultAccountService instance created");
    }

}
