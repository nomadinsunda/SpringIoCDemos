package com.intheeast.ioc.beanoverview.service;

import com.intheeast.ioc.beanoverview.interfaces.PaymentService;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("[Card] Paid: " + amount);
    }
}