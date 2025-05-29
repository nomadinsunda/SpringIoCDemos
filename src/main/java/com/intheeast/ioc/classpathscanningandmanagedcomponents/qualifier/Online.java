package com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
//@Component
public @interface Online {
}
