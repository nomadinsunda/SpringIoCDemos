package com.intheeast.ioc.customizingnatureofbean.lifecyclecallbacks.lifecycle.service;

import org.springframework.context.Lifecycle;

public class LifeCycleService implements Lifecycle{
	private boolean isRunning = false;

	@Override
	public void start() {
		isRunning = true;
		System.out.println("LifeCycleService:start");
	}

	@Override
	public void stop() {
		isRunning = false;
		System.out.println("LifeCycleService:stop");
		
	}

	@Override
	public boolean isRunning() {
		System.out.println("LifeCycleService:isRunning");
		return isRunning;
	}
	
	public void destroy() {
		System.out.println("LifeCycleService:destroy");

	}

}
