package com.zoumf77.singleton;

public class KeyGenerator {
	private static KeyGenerator instance=new KeyGenerator();
	private int key=1000;
	
	/*单例类，建议把构造函数说明private,要不然别的程序员可能会实例化它，那么该类在内存中就不只一个实例了*/
	private KeyGenerator(){
		
	}
	
	public static KeyGenerator getInstance(){
		return instance;
	}
	
	public synchronized int getNextKey(){
		return key++;
	}
}
