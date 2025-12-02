package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {

	@Override
	public int getOrder() {
		return 0;
	}
	
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            ExampleBean exampleBean = (ExampleBean) bean;
            System.out.println("CustomBeanPostProcessor - postProcessBeforeInitialization: " + beanName);
            exampleBean.setMessage(exampleBean.getMessage() + " [Modified by CustomBeanPostProcessor]");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            System.out.println("CustomBeanPostProcessor - postProcessAfterInitialization: " + beanName);
        }
        return bean;
    }

	
}
