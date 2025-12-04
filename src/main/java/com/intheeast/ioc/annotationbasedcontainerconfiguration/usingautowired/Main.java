package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired;


import java.util.Optional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.config.AppConfig;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.config.SelfInjectionBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.dao.UserDao;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MovieRecommender;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleCatalogConsumer;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleConstructorsBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.OptionalInjectionBean;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service.SimpleMovieLister;

public class Main {
	
	// 참조 변수가 null을 가질 수가 있는데,
	// 만약 참조 변수가 null일 때, 이 참조 변수에 액세스 멤버 연산자를 사용할 경우
	// NullPointerException이 발생함...
	// : 사전에 예방할 수 있도록 참조 변수를 wrapping한다...
	public static Optional<String> findNameById(int id) {
        if (id == 1) {
        	// of 메서드에게 전달되는 것은 "홍길동"이라는 문자열 리터럴인가요?
        	// : "홍길동" 문자열 리터럴을 위해서 만들어진 String 클래스 인스턴스에 대한 참조값이 전달
            return Optional.of("홍길동");  // 값이 있을 때
        } else {
            return Optional.empty();      // 값이 없을 때
        }
    }

    public static void main(String[] args) {
    	
//    	UserDao userDao = UserDao.builder()
//    							.name("seo")
//    							.id("1234")
//    							.dataSource(null)
//    							.build();
    	
    	Optional<String> nameOpt = findNameById(1);
    	if (!nameOpt.isEmpty()) {
    		String name = nameOpt.get();
    	} else {
    		
    	}
    	
    	nameOpt.ifPresent(name -> System.out.println("이름: " + name));

        // 2. 값이 없으면 기본값 사용
        String name = nameOpt.orElse("이름없음");
        
        try {
            String mustExistName = nameOpt.orElseThrow(() -> new IllegalArgumentException("이름이 존재하지 않습니다."));
            System.out.println("필수 이름: " + mustExistName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }        
    	
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
