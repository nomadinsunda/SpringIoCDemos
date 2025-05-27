package com.intheeast.ioc.classpathscanningandmanagedcomponents.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/*
 public @interface Component {	
	String value() default "";
}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface MyService {
	@AliasFor(annotation = Component.class, attribute = "value")
	String value() default "";
}