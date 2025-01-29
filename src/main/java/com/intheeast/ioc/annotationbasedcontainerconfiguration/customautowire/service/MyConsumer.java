package com.intheeast.ioc.annotationbasedcontainerconfiguration.customautowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.customautowire.marker.MyMarker;

@Component
public class MyConsumer {

    // 커스텀 애노테이션 @MyMarker를 Qualifier처럼 사용하고 싶음
    @Autowired
    @MyMarker
    private MyService myService;

    public void test() {
        myService.doSomething();
    }
}
