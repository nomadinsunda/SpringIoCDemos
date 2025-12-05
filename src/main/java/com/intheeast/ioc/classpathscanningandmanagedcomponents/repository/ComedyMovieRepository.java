package com.intheeast.ioc.classpathscanningandmanagedcomponents.repository;

import org.springframework.stereotype.Component;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.domain.Movie;

import java.util.List;

@Component("comedyMovieRepo")
public class ComedyMovieRepository implements MovieRepository {
	
	public ComedyMovieRepository() {
		int a = 0;
	}
    @Override
    public List<Movie> findMovies() {
        return List.of(new Movie("The Hangover", "Comedy"), new Movie("Superbad", "Comedy"));
    }
}
