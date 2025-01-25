package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.finder;

import org.springframework.stereotype.Component;

@Component
public class MovieFinderImpl implements MovieFinder {

    @Override
    public String findAll() {
        return "MovieFinderImpl: Searching for movies...";
    }
}
