package com.intheeast.ioc.dependencies.methodinjection.lookupmethodinjection2.config;

import org.springframework.context.annotation.*;

import com.intheeast.ioc.dependencies.methodinjection.lookupmethodinjection2.service.Invoice;
import com.intheeast.ioc.dependencies.methodinjection.lookupmethodinjection2.service.OrderService;

@Configuration
@ComponentScan(basePackages= {"com.intheeast.ioc.dependencies.methodinjection.lookupmethodinjection2"})
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Invoice invoice() {
        return new Invoice();
    }
}
