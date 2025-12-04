package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
	
	private MovieCatalog mc;
	
	@Autowired	
	public MovieRecommender(@Qualifier("first")MovieCatalog mc) {
		this.mc = mc;
	}
	
	public MovieCatalog getMovieCatalog() {
		return this.mc;
	}

}
