package com.intheeast.ioc.classpathscanningandmanagedcomponents.repository;

import org.springframework.stereotype.Component;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.domain.Movie;

import java.util.List;

@Component // 디폴트로 빈이름은 : actionMovieRepository
public class ActionMovieRepository implements MovieRepository {
	
	public ActionMovieRepository() {
		System.out.println("ActionMovieRepository Constructor");
	}
	
    @Override
    public List<Movie> findMovies() {
        return List.of(new Movie("Mad Max", "Action"), new Movie("Die Hard", "Action"));
    }
}
