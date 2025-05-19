package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.marker;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyMarker {
}
