package com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.config;


import org.springframework.context.annotation.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model.*;

@Configuration
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public AsyncCommand asyncCommand() {
		return new AsyncCommand();
	}

	@Bean
	public CommandManager commandManager() {
		// 익명 내부 클래스로 Lookup Method Injection
		return new CommandManager() {
			@Override
			protected Command createCommand() {
				return asyncCommand();  // 매번 새로운 AsyncCommand 반환
			}
		};
	}
}
