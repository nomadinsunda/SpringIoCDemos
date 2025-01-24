package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.startupndshutdowncallbacks.model;

import org.springframework.context.SmartLifecycle;

public class CustomSmartLifecycleBean implements SmartLifecycle {

    private boolean running = false;

    @Override
    public void start() {
        System.out.println("CustomSmartLifecycleBean: Starting with phase " + getPhase() + "...");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("CustomSmartLifecycleBean: Stopping with phase " + getPhase() + "...");
        running = false;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("CustomSmartLifecycleBean: Asynchronous stopping...");
        stop();
        callback.run(); // shutdown callback
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 1; // 실행 순서를 정의: 낮은 숫자가 먼저 시작
    }

    @Override
    public boolean isAutoStartup() {
        return true; // 컨텍스트 초기화 시 자동 시작
    }
}
