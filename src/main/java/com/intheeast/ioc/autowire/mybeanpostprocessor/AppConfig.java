package com.intheeast.ioc.autowire.mybeanpostprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.mybeanpostprocessor")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig");
	}

    // BeanPostProcessor는 명시적으로 설정되어야 함
	
    @Bean
    public static BeanFactoryPostProcessor myBeanFactoryPostProcessor() {
    	    	
    	// 	void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
    	BeanFactoryPostProcessor bpp = beanFactory -> {
    		// Spring IoC 컨테이너의 DefaultListableBeanFactory를 
    		// 주입해 줌...
    		// ConfigurableListableBeanFactory
    		//DefaultListableBeanFactory dbf;
    		MyRepository myRepo = (MyRepository) beanFactory.getBean("myRepository");

    		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("myRepository");

            // BeanDefinition 수준에서 프로퍼티를 수정함
            //beanDefinition.getPropertyValues().add("", "");
                		
    		System.out.println("BeanFactoryPostProcessor executed.");
    	};
    	
    	return bpp;
    }
}