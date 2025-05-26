package com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners.service.EmailService;

import java.util.List;



@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.additionalcapabilitiesoftheapplicationcontext.annotationbasedeventlisteners")
public class AppConfig {

    @Bean
    public EmailService emailService() {
        EmailService service = new EmailService();
        service.setBlockedList(List.of("spam@example.com", "hacker@example.com"));
        return service;
    }
}
