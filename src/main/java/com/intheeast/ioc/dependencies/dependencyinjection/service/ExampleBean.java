package com.intheeast.ioc.dependencies.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 어노테이션 기반 구성 메타데이터
public class ExampleBean {

	
    private final int years;
    private final String ultimateAnswer;

    //@Autowired
    public ExampleBean(
            @Value("${example.years}") int years,
            @Value("${example.ultimateAnswer}") String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    // Getter 생략
}