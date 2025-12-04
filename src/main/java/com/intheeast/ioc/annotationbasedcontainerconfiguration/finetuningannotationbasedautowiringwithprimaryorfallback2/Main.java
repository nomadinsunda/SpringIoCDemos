package com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback2.config.AppConfig;
public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();

	}

}
