package com.intheeast.ioc.usingjsr330.named.finder;

import org.springframework.stereotype.Component;

@Component
public class OptionalMovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "OptionalMovieFinderImpl: Searching for alternative movies...";
    }
}
