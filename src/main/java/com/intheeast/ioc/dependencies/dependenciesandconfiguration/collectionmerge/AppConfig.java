package com.intheeast.ioc.dependencies.dependenciesandconfiguration.collectionmerge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.dependencies.dependenciesandconfiguration.collections.model.ComplexObject;

import java.util.Properties;

// @Configuration 어노테이션이 적용된 클래스도 스프링 컨테이너에 빈으로 등록됩니다.
@Configuration
public class AppConfig {

    @Bean(name = "parent")
    public ComplexObject parent() {
        ComplexObject parent = new ComplexObject();
        
        // DI라고 하기에는 좀 그렇기 한데...
        // ComplexObject가 필드로 Properties를 가지고 있음.
        // 의존성을 해결하는 코드
        Properties adminEmails = new Properties();
        adminEmails.setProperty("admin", "admin@example.com");
        adminEmails.setProperty("support", "support@example.com");
        parent.setAdminEmails(adminEmails);
        
        return parent;
    }

    @Bean(name = "child")
    public ComplexObject child() {
        // 부모 Bean을 가져와서 adminEmails를 복사하고 추가로 merge
        ComplexObject child = new ComplexObject();
        Properties mergedAdminEmails = new Properties();

        // 부모 속성 복사
        mergedAdminEmails.putAll(parent().getAdminEmails());

        // 자식 속성 merge (덮어쓰기 포함)
        mergedAdminEmails.setProperty("sales", "sales@example.com");
        mergedAdminEmails.setProperty("support", "support@otherdomain.com");  // support는 override됨

        child.setAdminEmails(mergedAdminEmails);
        return child;
    }
}