package com.intheeast.ioc.classpathscanningandmanagedcomponents.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier.Online;
import com.intheeast.ioc.classpathscanningandmanagedcomponents.repository.MovieRepository;

@Service
public class QualifierMovieService {

    @Autowired
    @Online
    private MovieRepository movieRepository;

    public void printMovies() {
        System.out.println("Online Movies: " + movieRepository.findMovies());
    }
}
