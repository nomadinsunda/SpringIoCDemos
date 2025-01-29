package com.intheeast.ioc.classpathscanningandmanagedcomponents.service;

import org.springframework.stereotype.Service;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public void listMovies() {
        List movies = repository.findMovies();
        System.out.println("Movies: " + movies);
    }
}
