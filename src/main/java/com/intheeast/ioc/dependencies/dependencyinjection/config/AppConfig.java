package com.intheeast.ioc.dependencies.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.intheeast.ioc.dependencies.dependencyinjection.service.MovieFinder;
import com.intheeast.ioc.dependencies.dependencyinjection.service.SimpleMovieFinder;
import com.intheeast.ioc.dependencies.dependencyinjection.service.SimpleMovieLister;

/* 
 Specify whether @Bean methods should get proxied in order to enforce 
 bean lifecycle behavior, 
 for example, to return shared singleton bean instances even 
 in case of direct @Bean method calls in user code. 
 This feature requires method interception, 
 implemented through a runtime-generated CGLIB subclass which comes with limitations such as the configuration class and its methods not being allowed to declare final.
 */
@Configuration(proxyBeanMethods=false)
@ComponentScan({"com.intheeast.ioc.dependencies.dependencyinjection"})
// @PropertySource는 해당 플레이스 홀더에 해당하는 값(key-value)이 없는 경우,
// @Value 어노테이션으로 값을 주입받고자하는 필드에 플레이스 홀더값을 대신 주입
@PropertySource("classpath:example/example.properties")
public class AppConfig {
	
	//example.years=42
			//example.ultimateAnswer=Life, Universe and Everything
	@Value("${example.month:42}")
	private Integer years;
	
	@Value("${example.ultimateAnswer}")
	private String ultimateAnswer;
	
	public AppConfig() {
		System.out.println("AppConfig");
	}

    // Define MovieFinder bean
    @Bean
    public MovieFinder movieFinder() {
        return new SimpleMovieFinder();
    }

    // Define SimpleMovieLister bean
    @Bean
    public SimpleMovieLister movieLister(/*MovieFinder movieFinder*/) {
    	
    	SimpleMovieLister movieLister = new SimpleMovieLister();
        movieLister.setMovieFinder(movieFinder()); // Setter-based DI
        return movieLister;
        
        //return new SimpleMovieLister(movieFinder);
    }
    
    // @Value 어노테이션으로 주입되려면, 반드시 다음 configure가 필요함!
    // Placeholder? 란? : 구글 검색창에 디폴트로 나타나는 "Google 검색 또는 URL 입력" 이 스트링을 플레이스홀더
    // PropertySourcesPlaceholderConfigurer는 해당 플레이스 홀더에 해당하는 값(key-value)이 없는 경우,
    // 프로그램을 종료시킴.
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        // 절대 경로=C:\development\Workspace\codes\spring_legacy\SpringIoCDemos\src\main\resources\example.properties
//        // The default class loader will be used for loading the resource.
//        // ../src/main/resources/example.properties
//        configurer.setLocation(new ClassPathResource("example/example.properties"));
//        return configurer;
//    }
}