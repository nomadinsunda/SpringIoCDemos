package com.intheeast.ioc.usingjsr330.namedclass.service;

import com.intheeast.ioc.usingjsr330.namedclass.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component 어노테이션 대신에, simpleMovieLister
@Named("movieListener")  // @ManagedBean("movieListener") could be used as well
public class SimpleMovieLister {

	private MovieFinder movieFinder;

	@Inject
	public void setMovieFinder(@Named("optionalMovieFinderImpl")MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void listMovies() {
		System.out.println(this.movieFinder.findAll());
		// ...
	}
}
