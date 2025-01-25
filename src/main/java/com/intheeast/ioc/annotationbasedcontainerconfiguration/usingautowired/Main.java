package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.config.AppConfig;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.config.SelfInjectionBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MovieRecommender;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleCatalogConsumer;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleConstructorsBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.OptionalInjectionBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.SimpleMovieLister;

public class Main {

    public static void main(String[] args) {
        // 1) Java 기반 설정 클래스(AppConfig)를 이용한 ApplicationContext 로딩
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 2) SimpleMovieLister 테스트 (Setter 주입)
        SimpleMovieLister lister = context.getBean(SimpleMovieLister.class);
        lister.listMovies();

        // 3) MovieRecommender 테스트 (생성자, 필드, 임의 메서드 주입)
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovie();

        // 4) 배열, 컬렉션, 맵 주입 예시
        MultipleCatalogConsumer catalogConsumer = context.getBean(MultipleCatalogConsumer.class);
        catalogConsumer.printCatalogs();

        // 5) MultipleConstructorsBean 테스트
        MultipleConstructorsBean multipleConstructorsBean = context.getBean(MultipleConstructorsBean.class);
        multipleConstructorsBean.doSomething();

        // 6) OptionalInjectionBean 테스트
        OptionalInjectionBean optionalBean = context.getBean(OptionalInjectionBean.class);
        optionalBean.printOptionalField();

        // 7) Self Injection 테스트
        SelfInjectionBean selfBean = context.getBean(SelfInjectionBean.class);
        selfBean.outerMethod();

        context.close();
    }
}
