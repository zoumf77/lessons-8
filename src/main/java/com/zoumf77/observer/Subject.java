package com.zoumf77.observer;

public interface Subject {
	/**
	 * 调用这个办法登记一个新的观察者
	 */
	public void attach(Observer observer);
	
	/**
	 * 调用这个办法删除一个登记过的观察者
	 */
	public void detach(Observer observer);
	/*
	 * 通知所有登记过的观察者
	 */
	
	void notifyObservers();
	
}
