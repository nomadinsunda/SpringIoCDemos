package com.intheeast.ioc.autowire.autowirerequired;

public class ActionMovieFinder {
	
	private DefaultMovieFinder dmf;
	
	public void setDmf(DefaultMovieFinder dmf) {
		this.dmf = dmf;
	}

}
