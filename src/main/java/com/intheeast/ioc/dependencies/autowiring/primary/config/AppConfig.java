package com.intheeast.ioc.dependencies.autowiring.primary.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.intheeast.ioc.dependencies.autowiring.PaymentService;
import com.intheeast.ioc.dependencies.autowiring.primary.service.CardPaymentService;
import com.intheeast.ioc.dependencies.autowiring.primary.service.CashPaymentService;

@Configuration
public class AppConfig {

    @Bean
    @Primary  // 기본 주입 대상으로 지정
    public PaymentService cardPaymentService() {
        return new CardPaymentService();
    }

    @Bean
    public PaymentService cashPaymentService() {
        return new CashPaymentService();
    }
}
