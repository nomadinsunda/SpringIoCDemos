package com.intheeast.ioc.autowire.orderedbean;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // 가장 높은 우선순위 (1) : 빈의 정렬 우선순위 : 컬렉션에서 사용될 때 인덱스 넘버와 관련됨
          // Spring 4.0 이후부터 컬렉션 DI 등 여러 컴포넌트에서 애노테이션 기반 정렬 지원.
@Primary // 디폴트 빈으로 설정
public class ComedyMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "Comedy Movie Catalog";
    }

    @Override
    public void displayMovies() {
        System.out.println("Displaying comedy movies.");
    }
}