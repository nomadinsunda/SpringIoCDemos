package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Fallback;
import org.springframework.context.annotation.Primary;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service.MovieCatalog;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service.SecondMovieCatalogImpl;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service.ThirdMovieCatalogImp;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service.FirstMovieCatalogImp;

@Configuration
@ComponentScan("com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.service")
public class AppConfig {

	// 🏆 이 빈은 '일반 후보'입니다.
    @Bean
    @Qualifier("first")
    public MovieCatalog firstMovieCatalog() { 
    	MovieCatalog fmci = new FirstMovieCatalogImp();
        return fmci; 
    }
    
    @Bean
    @Primary
    public MovieCatalog thirdMovieCatalog() { 
    	MovieCatalog fmci = new ThirdMovieCatalogImp();
        return fmci; 
    }

    // 🗑️ 이 빈은 '예비(Fallback)' 후보가 됩니다.
    @Bean
    @Fallback
    public MovieCatalog secondMovieCatalog() {
    	MovieCatalog fmci = new SecondMovieCatalogImpl(); 
    	return fmci;
    }
}