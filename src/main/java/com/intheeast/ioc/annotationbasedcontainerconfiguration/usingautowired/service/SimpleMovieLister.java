package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.finder.MovieFinder;

@Service // 어노테이션 기반의 구성 메타데이터(스프링 IoC 컨테이너의 컴포넌트 스캔으로 스캔되어 빈으로 등록된다)
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    // Setter Injection
    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        System.out.println("[SimpleMovieLister] " + movieFinder.findAll());
    }
}
