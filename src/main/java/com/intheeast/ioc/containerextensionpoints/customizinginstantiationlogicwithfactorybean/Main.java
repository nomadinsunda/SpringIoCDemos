package com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean.config.AppConfig;
import com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean.model.CustomObject;
import com.intheeast.ioc.containerextensionpoints.customizinginstantiationlogicwithfactorybean.model.CustomObjectFactoryBean;
public class Main {

    public static void main(String[] args) {
        // ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // FactoryBean이 생성한 CustomObject 가져오기
        CustomObject customObject = context.getBean("customObjectFactoryBean", 
        		CustomObject.class); // CustomObject.class:Class<CustomObject> clazz
        System.out.println("CustomObject: " + customObject);

        // FactoryBean 자체 가져오기
        CustomObjectFactoryBean factoryBean = context.getBean("&customObjectFactoryBean", CustomObjectFactoryBean.class);
        System.out.println("FactoryBean: " + factoryBean);

        // 컨텍스트 종료
        context.close();
    }
}
