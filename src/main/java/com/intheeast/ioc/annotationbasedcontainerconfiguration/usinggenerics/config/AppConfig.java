package com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.domain.IntegerStore;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.domain.Store;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.domain.StringStore;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics")
public class AppConfig {
	
	@Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }
    
    @Bean
    public IntegerStore integerStore2() {
        return new IntegerStore();
    }

}
