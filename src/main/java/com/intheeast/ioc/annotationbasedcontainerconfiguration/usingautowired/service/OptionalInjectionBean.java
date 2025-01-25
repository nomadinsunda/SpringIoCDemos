package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.finder.MovieFinder;

import jakarta.annotation.Nullable;

// import javax.inject.Inject; // JSR-330 @Inject 사용 예시 가능
import java.util.Optional;

@Component
public class OptionalInjectionBean {

    // 1) @Autowired(required=false)
    @Autowired(required = false)
    private MovieFinder optionalField; // 주입 실패 시 null

    // 2) Optional 파라미터
    @Autowired
    public void setOptionalFinder(Optional<MovieFinder> optionalFinder) {
        optionalFinder.ifPresentOrElse(
            finder -> System.out.println("[OptionalInjectionBean] setOptionalFinder: " + finder.findAll()),
            () -> System.out.println("[OptionalInjectionBean] setOptionalFinder: No MovieFinder found")
        );
    }

    // 3) @Nullable 파라미터
    @Autowired
    public void setNullableFinder(@Nullable MovieFinder nullableFinder) {
        if (nullableFinder != null) {
            System.out.println("[OptionalInjectionBean] setNullableFinder: " + nullableFinder.findAll());
        } else {
            System.out.println("[OptionalInjectionBean] setNullableFinder: No MovieFinder available (null)");
        }
    }

    public void printOptionalField() {
        if (optionalField != null) {
            System.out.println("[OptionalInjectionBean] optionalField: " + optionalField.findAll());
        } else {
            System.out.println("[OptionalInjectionBean] optionalField is null - no bean injected");
        }
    }
}
