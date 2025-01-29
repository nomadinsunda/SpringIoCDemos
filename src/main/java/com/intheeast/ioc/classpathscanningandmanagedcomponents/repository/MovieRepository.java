package com.intheeast.ioc.classpathscanningandmanagedcomponents.repository;


import java.util.List;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.domain.Movie;

public interface MovieRepository {
    List<Movie> findMovies();
}
