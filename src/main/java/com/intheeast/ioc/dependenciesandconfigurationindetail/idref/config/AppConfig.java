package com.intheeast.ioc.dependenciesandconfigurationindetail.idref.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.dependenciesandconfigurationindetail.idref.service.ClientBean;
import com.intheeast.ioc.dependenciesandconfigurationindetail.idref.service.TargetBean;

@Configuration
public class AppConfig {
	
	@Bean
    public TargetBean theTargetBean() {
        return new TargetBean();
    }

    @Bean
    public ClientBean theClientBean(TargetBean targetBean) {
        ClientBean client = new ClientBean();
//        client.setTargetName(targetBean.getClass().getSimpleName()); // Bean 이름 설정
        client.setTargetName("theTargetBean");
        return client;
    }
	
}