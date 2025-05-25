package com.intheeast.ioc.usingjsr330.optional.service;

import java.util.Optional;

import com.intheeast.ioc.usingjsr330.optional.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SimpleMovieLister {

	private Optional<MovieFinder> optionalFinder;

	@Inject
	public void setMovieFinder(Optional<MovieFinder> optionalFinder) {
		this.optionalFinder = optionalFinder;
	}

	public void listMovies() {
		
		optionalFinder.ifPresentOrElse(
				finder -> System.out.println(finder.findAll()),
	            () -> System.out.println(
	            		"[SimpleMovieLister] listMovies: No MovieFinder found")
	    );
	}
}