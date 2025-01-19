package com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators.config.ChildConfig;
import com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators.config.ParentConfig;
import com.intheeast.ioc.dependenciesandconfigurationindetail.collaborators.service.AccountService;
import com.intheeast.ioc.dependenciesandconfigurationindetail.idref.config.AppConfig;

public class MainApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext parentContext = 
				new AnnotationConfigApplicationContext(ParentConfig.class);

        // 자식 컨텍스트 생성 및 부모 설정
        AnnotationConfigApplicationContext childContext = 
        		new AnnotationConfigApplicationContext();
        childContext.setParent(parentContext); // 부모 컨텍스트 설정
        childContext.register(ChildConfig.class);
        childContext.refresh();

        // 자식 컨텍스트에서 Proxy 빈 가져오기
        ProxyFactoryBean proxyFactoryBean = childContext.getBean(ProxyFactoryBean.class);
        AccountService accountService = 
        		(AccountService) proxyFactoryBean.getObject();

        // 테스트 출력
        accountService.performOperation(); // AccountService의 메서드 호출

	}

}
