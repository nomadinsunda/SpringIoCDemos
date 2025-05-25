package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.config.AppConfig;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerLookup;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerProvider;

public class Main {
	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("=== @Lookup 사용 ===");
		var m1 = ctx.getBean(EncryptorManagerLookup.class);
		m1.process("Hello");
		m1.process("World");

		System.out.println("=== ObjectProvider 사용 ===");
		var m2 = ctx.getBean(EncryptorManagerProvider.class);
		m2.process("Hello");
		m2.process("World");

		ctx.close();
	}
}