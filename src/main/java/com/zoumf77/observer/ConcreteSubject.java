package com.zoumf77.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector<Observer> observersVector=new Vector<>();
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observersVector.removeElement(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumeration=observersVector.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement().update();
		}
	}
	
	
}
