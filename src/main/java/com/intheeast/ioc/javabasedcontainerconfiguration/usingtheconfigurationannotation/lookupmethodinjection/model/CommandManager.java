package com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model;


public abstract class CommandManager {

	public Object process(Object commandState) {
		Command command = createCommand();  // 매번 새로운 프로토타입
		command.setState(commandState);
		return command.execute();
	}

	// 반드시 오버라이드해야 함
	protected abstract Command createCommand();
}
