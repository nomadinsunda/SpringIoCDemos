package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.config.AppConfig;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.declaringbean.service.*;


public class Main {
	
	public static void main(String[] args) {
        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

//        TransferService transferService = ctx.getBean(TransferService.class);
//        transferService.transfer();
        
        TransferServiceImpl transferServiceImple = ctx.getBean(TransferServiceImpl.class);
        transferServiceImple.transfer();
        transferServiceImple.audit();
        transferServiceImple.log();
            
    }

}
