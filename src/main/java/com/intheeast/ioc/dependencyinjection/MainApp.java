package com.intheeast.ioc.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.dependencyinjection.config.AppConfig;
import com.intheeast.ioc.dependencyinjection.service.SimpleMovieLister;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the SimpleMovieLister bean
        SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);

        // Call the listMovies method
        movieLister.listMovies();
    }
}