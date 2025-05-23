package com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.config.AppConfig;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.service.MyConsumer;
import com.intheeast.ioc.annotationbasedcontainerconfiguration.usingcustomautowire.service.MyProducer;

public class Main {
    public static void main(String[] args) {

        // 스프링 컨텍스트 초기화 (Java Config)
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // @Component 스캔된 MyConsumer 빈을 가져오기
        MyConsumer consumer = ctx.getBean(MyConsumer.class);
        // 테스트 실행
        consumer.test();
        
        MyProducer producer = ctx.getBean(MyProducer.class);
        producer.test();

        ctx.close();
    }
}
