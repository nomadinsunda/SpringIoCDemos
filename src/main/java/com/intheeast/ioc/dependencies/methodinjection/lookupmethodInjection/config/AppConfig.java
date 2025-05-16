package com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.model.AsyncCommand;
import com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.model.Command;
import com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.model.CommandManager;

@Configuration
public class AppConfig {
	
	@Bean
    @Scope("prototype")
    public AsyncCommand asyncCommand() {
        AsyncCommand command = new AsyncCommand();
        // 필요에 따라 여기서 의존성 주입
        return command;
    }

    @Bean
    public CommandManager commandManager() {
        // createCommand()를 오버라이드하여 새로운 프로토타입 Command 객체를 반환하는
        // CommandManager의 익명 구현 반환
    	// 추상 클래스를 인스턴스화할 수 있는 방법은
    	// -추상 클래스를 상속한 클래스
    	// -익명 클래스
        return new CommandManager() {
        	
//        	public Object process(Object commandState) {
//                // 적절한 Command 인터페이스의 새 인스턴스 생성
//                Command command = createCommand();
//                // (가능하면 새로운) Command 인스턴스에 상태 설정
//                command.setState(commandState);
//                return command.execute();
//            }
        	
            protected Command createCommand() {
            	
                return asyncCommand();
            }
        };
    }


}
