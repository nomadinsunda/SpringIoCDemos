package com.intheeast.ioc.dependencies.dependenciesandconfiguration.collectionmerge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.intheeast.ioc.dependencies.dependenciesandconfiguration.collections.model.ComplexObject;

import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean(name = "parent")
    public ComplexObject parent() {
        ComplexObject parent = new ComplexObject();
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