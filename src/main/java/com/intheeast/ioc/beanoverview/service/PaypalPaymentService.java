package com.intheeast.ioc.beanoverview.service;

import com.intheeast.ioc.beanoverview.interfaces.PaymentService;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("[PayPal] Paid: " + amount);
    }
}
