package com.intheeast.ioc.usingjsr330.provider.service;

import com.intheeast.ioc.usingjsr330.provider.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class SimpleMovieLister {

	private Provider<MovieFinder> movieFinederProvider;

	@Inject
	public void setMovieFinder(Provider<MovieFinder> movieFinederProvider) {
		this.movieFinederProvider = movieFinederProvider;
	}

	public String listMovies() {
		MovieFinder movieFinder = this.movieFinederProvider.get();
		return movieFinder.toString() + movieFinder.findAll();
		// ...
	}
}
