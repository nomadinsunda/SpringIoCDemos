package com.intheeast.ioc.customizingnatureofbean.beanpostprocessor.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
	
	// 빈들이 등록될 때 어떤 빈들이 등록되는지를 알고자 하는 것
	@Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof DefaultAccountService) {
            System.out.println("-> PostProcessor: " + beanName + " 초기화 전 작업 수행");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
         if (bean instanceof DefaultAccountService) {
            System.out.println("-> PostProcessor: " + beanName + " 초기화 후 작업 수행");
        }
        return bean;
    }

}
