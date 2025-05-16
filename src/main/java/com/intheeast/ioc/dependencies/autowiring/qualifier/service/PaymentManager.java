package com.intheeast.ioc.dependencies.autowiring.qualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.dependencies.autowiring.PaymentService;

@Component
public class PaymentManager {

    private final PaymentService paymentService;

    @Autowired
    public PaymentManager(@Qualifier("cashPayment") 
    			PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process() {
        paymentService.pay(5000);
    }
}
