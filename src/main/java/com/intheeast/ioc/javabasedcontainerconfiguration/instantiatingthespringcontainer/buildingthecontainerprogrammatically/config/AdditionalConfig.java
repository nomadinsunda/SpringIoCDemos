package com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency1;
import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.dependency.Dependency2;
import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.service.MyService;
import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.buildingthecontainerprogrammatically.service.MyServiceImpl;

@Configuration
public class AdditionalConfig {
	@Bean
	public MyService myService(Dependency1 d1, Dependency2 d2) {
		return new MyServiceImpl(d1, d2);
	}
}