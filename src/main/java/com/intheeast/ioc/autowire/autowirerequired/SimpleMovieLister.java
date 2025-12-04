package com.intheeast.ioc.autowire.autowirerequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    // Spring IoC 컨테이너에 해당 디펜던시가 빈으로 등록되어 있지만 않다면,
    // @Autowired 어노테이션이 붙어 있는 세터는 Spring IoC 컨테이너가 호출
    // 세터 기반의 DI를 수행하지 않음
    @Autowired(required = false)  
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        if (movieFinder != null) {
            movieFinder.findMovies();
        } else {
            System.out.println("No MovieFinder available.");
        }
    }
}