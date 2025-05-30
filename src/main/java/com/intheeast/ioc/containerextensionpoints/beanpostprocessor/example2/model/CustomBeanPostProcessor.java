package com.intheeast.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            ExampleBean exampleBean = (ExampleBean) bean;
            System.out.println("CustomBeanPostProcessor - Before Initialization: " + beanName);
            exampleBean.setMessage(exampleBean.getMessage() + " [Modified by CustomBeanPostProcessor]");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            System.out.println("CustomBeanPostProcessor - After Initialization: " + beanName);
        }
        return bean;
    }

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
