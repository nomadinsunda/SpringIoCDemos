package com.intheeast.ioc.dependencies.methodinjection.lookupmethodinjection2.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service // 이 경우에는 @Component 타입으로 빈을 등록해야 함.
public class OrderService {

    public void processOrder(String orderId, double amount) {
        Invoice invoice = createInvoice();
        invoice.generate(orderId, amount);
        invoice.printInvoice();
    }

    @Lookup
    protected Invoice createInvoice() {
        return null; // 런타임에 오버라이딩됨
    }
}
