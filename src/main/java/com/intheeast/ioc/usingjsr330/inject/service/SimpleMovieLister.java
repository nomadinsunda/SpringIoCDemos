package com.intheeast.ioc.usingjsr330.inject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.intheeast.ioc.usingjsr330.inject.finder.MovieFinder;

import jakarta.inject.Inject;

public class SimpleMovieLister {

	private MovieFinder movieFinder;

	@Inject // @Autowired
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	//@Autowired
	public void listMovies() {
		System.out.println(this.movieFinder.findAll());
		// ...
	}
}
