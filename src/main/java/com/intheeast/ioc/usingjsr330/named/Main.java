package com.intheeast.ioc.usingjsr330.named;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.usingjsr330.named.config.AppConfig;
import com.intheeast.ioc.usingjsr330.named.service.SimpleMovieLister;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		SimpleMovieLister simpleMovieLister = 
				context.getBean(SimpleMovieLister.class);
		
		simpleMovieLister.listMovies();
		
	}

}
