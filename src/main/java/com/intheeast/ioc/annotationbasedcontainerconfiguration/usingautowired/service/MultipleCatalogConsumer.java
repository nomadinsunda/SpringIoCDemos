package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.util.MovieCatalog;

import java.util.Map;
import java.util.Set;

@Service
public class MultipleCatalogConsumer {

    // 1) 배열 주입
    @Autowired
    private MovieCatalog[] movieCatalogArray;

    // 2) 컬렉션(Set) 주입
    private Set<MovieCatalog> movieCatalogSet;

    @Autowired
    public void setMovieCatalogs(Set<MovieCatalog> movieCatalogSet) {
        this.movieCatalogSet = movieCatalogSet;
    }

    // 3) Map 주입 (key는 String(bean name), value는 MovieCatalog)
    private Map<String, MovieCatalog> catalogMap;

    @Autowired
    public void setCatalogMap(Map<String, MovieCatalog> catalogMap) {
        this.catalogMap = catalogMap;
    }

    public void printCatalogs() {
        System.out.println("=== Array Injection ===");
        for (MovieCatalog c : movieCatalogArray) {
            System.out.println(" - " + c.getCatalogName());
        }

        System.out.println("=== Set Injection ===");
        for (MovieCatalog c : movieCatalogSet) {
            System.out.println(" - " + c.getCatalogName());
        }

        System.out.println("=== Map Injection ===");
        for (Map.Entry<String, MovieCatalog> entry : catalogMap.entrySet()) {
            System.out.println(" - key: " + entry.getKey() 
                             + ", value: " + entry.getValue().getCatalogName());
        }
    }
}
