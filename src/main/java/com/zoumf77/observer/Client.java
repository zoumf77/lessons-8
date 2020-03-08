package com.zoumf77.observer;

public class Client {
	
	public static void main(String[] args){
		Subject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver());
		subject.attach(new ConcreteObserver1());
		subject.notifyObservers();
	}
}
