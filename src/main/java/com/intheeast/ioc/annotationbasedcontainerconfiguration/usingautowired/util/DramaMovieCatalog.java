package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingautowired.util;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class DramaMovieCatalog implements MovieCatalog {

    @Override
    public String getCatalogName() {
        return "DramaMovieCatalog";
    }
}
