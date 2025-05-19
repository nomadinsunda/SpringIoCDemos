package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Offline {
}
