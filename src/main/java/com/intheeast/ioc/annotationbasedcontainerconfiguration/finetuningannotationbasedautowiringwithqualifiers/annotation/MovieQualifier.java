package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithqualifiers.domain.Format;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MovieQualifier {
    String genre();
    Format format();
}
