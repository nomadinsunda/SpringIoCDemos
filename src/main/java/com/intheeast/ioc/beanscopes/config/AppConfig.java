package com.intheeast.ioc.beanscopes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.intheeast.ioc.beanscopes.model.DefaultAccountService;
import com.intheeast.ioc.beanscopes.model.MyBean;
import com.intheeast.ioc.beanscopes.model.PrototypeDependency;
import com.intheeast.ioc.beanscopes.model.SingletonWithPrototype;

@Configuration
public class AppConfig {

    // Singleton Scope (Default)
    @Bean
    public DefaultAccountService defaultAccountService() {
        return new DefaultAccountService();
    }

    // Prototype Scope
    @Bean
    @Scope("prototype")
    public PrototypeDependency prototypeDependency() {
        return new PrototypeDependency();
    }

    // Lifecycle Bean
    @Bean/*(initMethod="init")*/
    public MyBean myBean() {
    	MyBean myBean = new MyBean();
    	myBean.init();
    	return myBean;
//        return new MyBean();
    }

    // Singleton with Prototype Dependency
    @Bean
    public SingletonWithPrototype singletonWithPrototype(org.springframework.beans.factory.ObjectFactory<PrototypeDependency> prototypeFactory) {
        return new SingletonWithPrototype(prototypeFactory);
    }
}