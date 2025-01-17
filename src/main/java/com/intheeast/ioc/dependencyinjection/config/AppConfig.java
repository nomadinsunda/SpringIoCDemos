package com.intheeast.ioc.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.dependencyinjection.service.MovieFinder;
import com.intheeast.ioc.dependencyinjection.service.SimpleMovieFinder;
import com.intheeast.ioc.dependencyinjection.service.SimpleMovieLister;

@Configuration
public class AppConfig {

    // Define MovieFinder bean
    @Bean
    public MovieFinder movieFinder() {
        return new SimpleMovieFinder();
    }

    // Define SimpleMovieLister bean
    @Bean
    public SimpleMovieLister movieLister(MovieFinder movieFinder) {
    	SimpleMovieLister movieLister = new SimpleMovieLister();
        movieLister.setMovieFinder(movieFinder); // Setter-based DI
        return movieLister;
        
        //return new SimpleMovieLister(movieFinder);
    }
}