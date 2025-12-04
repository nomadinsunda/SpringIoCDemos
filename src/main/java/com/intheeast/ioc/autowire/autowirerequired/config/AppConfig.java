package com.intheeast.ioc.autowire.autowirerequired.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import com.intheeast.ioc.autowire.autowirerequired.DefaultMovieFinder;
import com.intheeast.ioc.autowire.autowirerequired.MovieFinder;
import com.intheeast.ioc.autowire.autowirerequired.ActionMovieCatalog;
import com.intheeast.ioc.autowire.autowirerequired.ActionMovieFinder;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.autowirerequired")
public class AppConfig {
	
	static {
		System.out.println("hello");
	}
	
	@Autowired
	private AppConfig appConfig; // AppConfig의 Proxy가 주입...
	
//	@Autowired
//	private DefaultMovieFinder dmf;
	
	@Bean
	public DefaultMovieFinder defaultMovieFinder() {
		return new DefaultMovieFinder();
	}
	
	@Bean
	public ActionMovieFinder actionMovieFinder() {
		ActionMovieFinder amf = new ActionMovieFinder();
		amf.setDmf(appConfig.defaultMovieFinder());
		return amf;
	}
	// MovieFinder 빈을 정의하지 않으면 SimpleMovieLister는 이를 생략하고 동작
    // 주석 처리된 부분을 해제하면 빈이 주입됨
//     @Bean
//     public MovieFinder movieFinder() {
//         return new DefaultMovieFinder();
//     }
}