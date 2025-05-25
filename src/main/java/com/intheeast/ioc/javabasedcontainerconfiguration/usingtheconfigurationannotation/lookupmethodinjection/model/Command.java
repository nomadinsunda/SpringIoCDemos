package com.intheeast.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model;

public interface Command {
	void setState(Object state);
	Object execute();
}