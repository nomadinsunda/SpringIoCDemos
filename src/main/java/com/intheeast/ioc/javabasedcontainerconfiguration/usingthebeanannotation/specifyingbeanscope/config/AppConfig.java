package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.Encryptor;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.EncryptorManagerProvider;
import com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope.TaskTracker;

@Configuration
@ComponentScan({"com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope"})
public class AppConfig {
	
	@Bean
	// ScopedProxyMode.TARGET_CLASS : 이 빈이 싱글톤에 주입될 때 프록시로 감싸지도록 지시합니다.
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public TaskTracker taskTracker() {
        // 이 메서드는 실제로는 단 한 번만 호출되거나, 프록시가 필요한 경우에만 호출됩니다.
        return new TaskTracker();
    }

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