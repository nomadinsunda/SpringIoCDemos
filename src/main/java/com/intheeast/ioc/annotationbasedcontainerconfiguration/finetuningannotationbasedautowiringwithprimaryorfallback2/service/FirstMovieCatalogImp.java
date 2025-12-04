package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service;

public class FirstMovieCatalogImp implements MovieCatalog {   

    public FirstMovieCatalogImp() {
    }
    
    	
	@Override
    public String getCatalogName() {
        return "hello";
    }
}