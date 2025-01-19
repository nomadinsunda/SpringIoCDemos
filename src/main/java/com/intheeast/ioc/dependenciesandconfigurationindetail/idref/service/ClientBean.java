package com.intheeast.ioc.dependenciesandconfigurationindetail.idref.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClientBean implements ApplicationContextAware {
    private String targetName;
    private TargetBean targetBean;
    private ApplicationContext applicationContext;

    // ApplicationContext 주입
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        if (targetName != null) {
            this.targetBean = (TargetBean) applicationContext.getBean(targetName);
        }
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
        if (applicationContext != null) {
            this.targetBean = (TargetBean) applicationContext.getBean(targetName);
        }
    }

    public TargetBean getTargetBean() {
        return targetBean;
    }

    public String getTargetName() {
        return targetName;
    }
}