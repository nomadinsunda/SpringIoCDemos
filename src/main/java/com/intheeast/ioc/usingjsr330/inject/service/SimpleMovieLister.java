package com.intheeast.ioc.usingjsr330.inject.service;

import com.intheeast.ioc.usingjsr330.inject.finder.MovieFinder;

import jakarta.inject.Inject;

public class SimpleMovieLister {

	private MovieFinder movieFinder;

	@Inject
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void listMovies() {
		this.movieFinder.findAll();
		// ...
	}
}
