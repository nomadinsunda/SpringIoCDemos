package com.intheeast.ioc.beanoverview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// Class<?>[] value();
@Import({AliasConfig.class, AutowireConfig.class,
	BasicBeanConfig.class, InstanceFactoryMethodConfig.class,
	LazyInitConfig.class, ScopeConfig.class,
	StaticFactoryMethodConfig.class})
public class AllConfigs {
//	int[] nums = {1,2,3,4,5};
//	Class<String> clazz = String.class; // String.class: 
	                                    // String 클래스를 타입 아규먼트로 하는
										// 파라미터화된 타입 Class<String> 객체의 참조값
	
	

}
