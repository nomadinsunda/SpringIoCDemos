package com.intheeast.ioc.classpathscanningandmanagedcomponents.repository;

import org.springframework.stereotype.Component;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.domain.Movie;
import com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier.Online;

import java.util.List;

@Component
@Online
public class ActionMovieRepository implements MovieRepository {
    @Override
    public List<Movie> findMovies() {
        return List.of(new Movie("Mad Max", "Action"), new Movie("Die Hard", "Action"));
    }
}
