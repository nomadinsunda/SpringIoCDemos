package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.Encryptor;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerProvider;

@Configuration
@ComponentScan({"com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope"})
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //("prototype")
	public Encryptor encryptor() {
		return new Encryptor();
	}

	@Bean
	public EncryptorManagerProvider managerProvider(
			ObjectFactory<Encryptor> provider) {
		return new EncryptorManagerProvider(provider);
	}
}