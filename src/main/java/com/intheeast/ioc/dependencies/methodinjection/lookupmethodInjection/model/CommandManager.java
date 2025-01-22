package com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.model;

public abstract class CommandManager {
	
	public Object process(Object commandState) {
        // 적절한 Command 인터페이스의 새 인스턴스 생성
        Command command = createCommand();
        // (가능하면 새로운) Command 인스턴스에 상태 설정
        command.setState(commandState);
        return command.execute();
    }

    // 이 메소드의 구현은 어디에 있을까?
    protected abstract Command createCommand();

}
