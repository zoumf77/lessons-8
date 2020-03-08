package com.zoumf77.abstractfactory;

public class TropicalVeggie implements Veggie {
	private String name;

	TropicalVeggie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
