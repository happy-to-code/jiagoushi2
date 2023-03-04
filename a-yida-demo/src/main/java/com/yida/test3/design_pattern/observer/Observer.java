package com.yida.test3.design_pattern.observer;

public abstract class Observer {
	protected Subject subject;
	
	public abstract void update();
}