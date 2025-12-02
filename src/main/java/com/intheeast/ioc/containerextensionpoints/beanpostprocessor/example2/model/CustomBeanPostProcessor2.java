package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor2 implements BeanPostProcessor, Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ExampleBean) {
            ExampleBean exampleBean = (ExampleBean) bean;
            System.out.println("CustomBeanPostProcessor2 - postProcessBeforeInitialization: " + beanName);
            exampleBean.setMessage(exampleBean.getMessage() + " [Modified by CustomBeanPostProcessor2]");
        }
        return bean;
	}

	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ExampleBean) {
            System.out.println("CustomBeanPostProcessor2 - postProcessAfterInitialization: " + beanName);
        }
        return bean;
	}

}
