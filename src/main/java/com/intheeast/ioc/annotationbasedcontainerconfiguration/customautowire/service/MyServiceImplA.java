package com.intheeast.ioc.annotationbasedcontainerconfiguration.customautowire.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.customautowire.marker.MyMarker;

@Component
@MyMarker
@Primary
public class MyServiceImplA implements MyService {

    @Override
    public void doSomething() {
        System.out.println("A is doing something.");
    }
}
