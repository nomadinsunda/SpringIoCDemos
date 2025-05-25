package com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.dependency.*;
import com.intheeast.ioc.javabasedcontainerconfiguration.instantiatingthespringcontainer.simpleconstruction.service.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            MyServiceImpl.class, Dependency1.class, Dependency2.class
        );

        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
    }
}