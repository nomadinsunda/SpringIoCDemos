package com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.CustomerPreferenceDao;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.MovieFinder;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.domain.MyMovieFinder;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.service.MovieRecommender;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.resourceinjection.service.SimpleMovieLister;

@Configuration
public class AppConfig {

    // 1) 이름이 "myMovieFinder"인 Bean
    @Bean
    public MovieFinder myMovieFinder() {
        return new MyMovieFinder();
    }

    // 2) 이름이 "customerPreferenceDao"인 Bean
    @Bean
    public CustomerPreferenceDao customerPreferenceDao2() {
        return new CustomerPreferenceDao();
    }

    // 3) MovieRecommender (자체 내부 @Resource로 인해 자동 주입)
    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }

    // 4) SimpleMovieLister (Setter @Resource(name="myMovieFinder") 사용)
    @Bean
    public SimpleMovieLister simpleMovieLister() {
        return new SimpleMovieLister();
    }
}
