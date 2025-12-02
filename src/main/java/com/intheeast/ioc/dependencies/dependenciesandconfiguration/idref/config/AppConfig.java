package com.intheeast.ioc.dependencies.dependenciesandconfiguration.idref.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.intheeast.ioc.dependencies.dependenciesandconfiguration.idref.service.ClientBean;
import com.intheeast.ioc.dependencies.dependenciesandconfiguration.idref.service.ManagerBean;
import com.intheeast.ioc.dependencies.dependenciesandconfiguration.idref.service.TargetBean;

@Configuration(proxyBeanMethods=true)
public class AppConfig {
	
	@Bean
//	@Scope("prototype")
    public TargetBean theTargetBean() {
        return new TargetBean();
    }

    @Bean
    public ClientBean theClientBean(/*TargetBean targetBean*/) {
        ClientBean client = new ClientBean();
//        Class clazz = targetBean.getClass();
//        String className = clazz.getSimpleName();
//        client.setTargetName(className);
        // 다음과 같이 chaining method call을 호출하면,
        // 위의 세개의 스테이트먼트를 하나의 스테이먼트로 해결할 수 있음
//        client.setTargetName(targetBean.getClass().getSimpleName()); // Bean 이름 설정
        client.setTargetName("theTargetBean");
        return client;
    }
    
    @Bean
    public ManagerBean theManagerBean() {
    	ManagerBean managerBean = new ManagerBean();
    	managerBean.setTargetBean(theTargetBean());
    	managerBean.setClientBean(theClientBean());
    	return managerBean;
    }
	
}