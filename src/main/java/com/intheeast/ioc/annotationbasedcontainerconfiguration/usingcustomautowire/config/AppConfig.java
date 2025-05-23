package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.config;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.marker.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ComponentScan(basePackages = "com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire")
public class AppConfig {

    @Bean
    public static CustomAutowireConfigurer customAutowireConfigurer() {
        // 1) CustomAutowireConfigurer 인스턴스 생성
        CustomAutowireConfigurer configurer = new CustomAutowireConfigurer();

        // 2) customQualifierTypes에 "MyMarker" 어노테이션 등록
        Set<Class<?>> customQualifiers = new HashSet<>();
        customQualifiers.add(MyMarker.class);
        customQualifiers.add(YourMarker.class);
        configurer.setCustomQualifierTypes(customQualifiers);

        // 3) 리턴
        return configurer;
    }
}
