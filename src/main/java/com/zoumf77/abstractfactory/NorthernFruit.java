package com.zoumf77.abstractfactory;

public class NorthernFruit implements Fruit{

	private String name;
	
	NorthernFruit(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
}
