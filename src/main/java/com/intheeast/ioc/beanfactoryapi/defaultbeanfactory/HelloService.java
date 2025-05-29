package com.intheeast.ioc.beanfactoryapi.defaultbeanfactory;

public class HelloService {
	
	private Printer printer;
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void sayHello() {
		printer.print("Hello, Spring Factory");
	}

}
