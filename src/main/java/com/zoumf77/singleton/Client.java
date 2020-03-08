package com.zoumf77.singleton;

public class Client {
	
	static KeyGenerator keyGenerator;
	public static void main(String[] args){
		keyGenerator=KeyGenerator.getInstance();
		
		for(int i=0;i<6;i++){
			Thread thread=new Thread(new NeedKeyApp(keyGenerator));
			thread.start();
		}
	}

	 static class NeedKeyApp implements Runnable{

		KeyGenerator keyGenerator;
		NeedKeyApp(KeyGenerator keyGenerator){
			this.keyGenerator=keyGenerator;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(keyGenerator.getNextKey());
		}
		
	}
}
