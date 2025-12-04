package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskManagementService {

    // 주입되는 것은 TaskTracker의 '프록시'입니다.
    private final TaskTracker trackerProxy;

    @Autowired
    public TaskManagementService(TaskTracker trackerProxy) {
        this.trackerProxy = trackerProxy;
        System.out.println("TaskManagementService (싱글톤) 초기화 완료. 프로토타입 프록시 주입.");
    }

    // 이 메서드가 호출될 때마다 프록시는 TaskTracker의 *새로운* 인스턴스를 가져옵니다.
    public void executeTask() {
        System.out.println("\n[TaskManagementService] executeTask 호출:");
        
        // 프록시를 통해 메서드를 호출하면, Spring은 새로운 TaskTracker 인스턴스를 생성하여 메서드를 실행합니다.
        trackerProxy.startNewTask();
        System.out.println("  사용된 TaskTracker ID: " + trackerProxy.getTaskId());
    }
}