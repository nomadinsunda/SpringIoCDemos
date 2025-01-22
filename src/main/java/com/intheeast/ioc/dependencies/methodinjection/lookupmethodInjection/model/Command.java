package com.intheeast.ioc.dependencies.methodinjection.lookupmethodInjection.model;

public interface Command {
    void setState(Object state);
    Object execute();
}
