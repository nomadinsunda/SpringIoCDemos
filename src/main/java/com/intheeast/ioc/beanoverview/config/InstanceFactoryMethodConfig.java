package com.intheeast.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.beanoverview.interfaces.PaymentService;
import com.intheeast.ioc.beanoverview.service.CardPaymentService;
import com.intheeast.ioc.beanoverview.service.PaypalPaymentService;
import com.intheeast.ioc.beanoverview.service.ServiceLocator;

@Configuration
public class InstanceFactoryMethodConfig {

    @Bean
    public ServiceLocator serviceLocator() {
    	
    	ServiceLocator locator = 
    			ServiceLocator.getInstance(); // 팩토리 Bean 생성

    	locator.registerFactory(PaypalPaymentService.class, PaypalPaymentService::new);

        locator.registerInstance(CardPaymentService.class, new CardPaymentService());

        return locator;
    }

    @Bean
    public CardPaymentService cardService(ServiceLocator serviceLocator) {
        return serviceLocator.getService(CardPaymentService.class); // 팩토리 메서드 호출
    }

    @Bean
    public PaypalPaymentService paypalService(ServiceLocator serviceLocator) {
        return serviceLocator.getService(PaypalPaymentService.class); // 다른 팩토리 메서드 호출
    }
}

