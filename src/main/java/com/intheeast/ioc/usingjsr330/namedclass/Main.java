package com.intheeast.ioc.usingjsr330.namedclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.usingjsr330.namedclass.config.AppConfig;
import com.intheeast.ioc.usingjsr330.namedclass.service.SimpleMovieLister;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		SimpleMovieLister simpleMovieLister = 
				context.getBean(SimpleMovieLister.class);
		
		simpleMovieLister.listMovies();
		
	}

}
