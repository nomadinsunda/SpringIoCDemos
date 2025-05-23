package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.dao.CustomerPreferenceDao;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.util.MovieCatalog;

// Service : 비즈니스 로직을 구현하는 컴포넌트
@Service // StereoType:이 컴포넌트(다음 클래스의 인스턴스)는 Service 목적을 두고 있다. 
public class MovieRecommender {

    // 1) 필드 주입 예시
    @Autowired
    private MovieCatalog movieCatalog;  // ActionMovieCatalog 또는 DramaMovieCatalog 중 자동 매칭

   
    private final CustomerPreferenceDao customerPreferenceDao;

    // 2) 생성자 주입 예시
    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
        
    }

    // 3)일반 메서드(여러 아규먼트) 주입 예시
    @Autowired
    public void prepare(MovieCatalog movieCatalog,
                        CustomerPreferenceDao customerPreferenceDao) {
        // 이 메서드는 선택적으로 한 번 더 주입받을 수 있음(실전에서는 과도한 주입 혼용은 지양)
        System.out.println("[MovieRecommender] prepare() called with: " 
                           + movieCatalog.getCatalogName() + ", " 
                           + customerPreferenceDao.getCustomerPreference());
    }

    public void recommendMovie() {
        String pref = customerPreferenceDao.getCustomerPreference();
        System.out.println("[MovieRecommender] Recommending movies for preference: " + pref);
        System.out.println("[MovieRecommender] Current catalog: " + movieCatalog.getCatalogName());
    }
}
