package com.intheeast.ioc.dependencies.autowiring.primary.service;

import org.springframework.stereotype.Service;

import com.intheeast.ioc.dependencies.autowiring.PaymentService;


public class CardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("💳 Card payment of " + amount + " processed.");
    }
}
