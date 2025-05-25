package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

import org.springframework.beans.factory.ObjectProvider;

public class EncryptorManagerProvider {

	private final ObjectProvider<Encryptor> encryptorProvider;

	public EncryptorManagerProvider(ObjectProvider<Encryptor> encryptorProvider) {
		this.encryptorProvider = encryptorProvider;
	}

	public void process(String data) {
		Encryptor encryptor = encryptorProvider.getObject();  // 매번 새 Encryptor
		encryptor.encrypt(data);
	}
}