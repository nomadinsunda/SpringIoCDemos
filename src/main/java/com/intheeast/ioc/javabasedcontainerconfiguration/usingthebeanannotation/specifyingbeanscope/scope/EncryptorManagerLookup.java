package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class EncryptorManagerLookup {

	public void process(String data) {
		Encryptor encryptor = getEncryptor();  // 매번 새 Encryptor
		encryptor.encrypt(data);
	}

	// @Lookup은 런타임 시, Spring이 CGLIB을 통해 구현체를 자동으로 생성하여 
	// getEncryptor() 호출 시 매번 새 Encryptor 빈을 주입합니다.
	@Lookup
	protected Encryptor getEncryptor() {
		return null;
	}
}