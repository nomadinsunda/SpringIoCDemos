package com.intheeast.ioc.classpathscanningandmanagedcomponents.domain;

import org.springframework.context.annotation.Bean;

public interface HelloWorld {

	@Bean
	default Movie goodByeWorld(String title, String genre) {
		
		return new Movie(title, genre);
		
	}
}
