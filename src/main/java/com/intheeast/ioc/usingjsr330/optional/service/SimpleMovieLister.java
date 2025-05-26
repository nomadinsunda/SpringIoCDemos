package com.intheeast.ioc.usingjsr330.optional.service;

import java.util.Optional;
import java.util.function.Consumer;

import com.intheeast.ioc.usingjsr330.optional.finder.MovieFinder;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SimpleMovieLister {

	private Optional<MovieFinder> optionalFinder;

	@Inject
	public void setMovieFinder(Optional<MovieFinder> optionalFinder) {
		this.optionalFinder = optionalFinder;
		boolean isNull = this.optionalFinder.isEmpty();
	}

	public void listMovies() {
		/*
		 Consumer<MovieFinder> {
			void accept(MovieFinder t);
		}
		MovieFinder finder -> System.out.println(finder.findAll())
		
		 public void ifPresentOrElse(Consumer<MovieFinder> action, 
		 							Runnable emptyAction) {
	        if (value != null) {
	            action.accept(value);
	        } else {
	            emptyAction.run();
	        }
	    }
		 */
		
		optionalFinder.ifPresentOrElse(
				finder -> System.out.println(finder.findAll()),
	            () -> System.out.println(
	            		"[SimpleMovieLister] listMovies: No MovieFinder found")
	    );
	}
}