package com.intheeast.ioc.autowire.orderedbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "com.intheeast.ioc.autowire.orderedbean")
public class AppConfig {

//    @Bean
//    @Primary
//    @Order(1) // : Bean 팩토리 메서드에서 사용될 때의 정수 값은 단지 컬렉션의 인덱스 넘버로 활용?
//    public MovieCatalog comedyMovieCatalog() {
//        return new ComedyMovieCatalog();
//    }
//
//    @Bean
//    @Order(2)
//    public MovieCatalog actionMovieCatalog() {
//        return new ActionMovieCatalog();
//    }
//
//    @Bean
//    @Order(3)
//    public MovieCatalog dramaMovieCatalog() {
//        return new DramaMovieCatalog();
//    }
}