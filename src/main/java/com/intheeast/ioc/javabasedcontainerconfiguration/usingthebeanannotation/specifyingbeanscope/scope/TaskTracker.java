package com.intheeast.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

public class TaskTracker {

    private int taskId;
    private static int nextId = 1;

    public TaskTracker() {
        // 새 인스턴스가 생성될 때마다 ID를 부여합니다.
        this.taskId = nextId++;
        System.out.println("TaskTracker[" + this.taskId + "]: 인스턴스가 생성됨.");
    }

    public int getTaskId() {
        return taskId;
    }

    public void startNewTask() {
        System.out.println("TaskTracker[" + this.taskId + "]: 새로운 작업 시작.");
    }
}