package com.zoumf77.decorator;

public class Decorator implements Component{

	private Component component;
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void doSomething() {

		//添加其他功能
		this.component.doSomething();
		
	}
	
}
