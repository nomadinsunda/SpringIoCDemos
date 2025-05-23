package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.marker.YourMarker;

@Component
public class MyProducer {
	
	@Autowired
	@YourMarker
	private MyService myService;
	
	public void test() {
        myService.doSomething();
    }

}
