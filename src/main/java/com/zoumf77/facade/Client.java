package com.zoumf77.facade;

public class Client {
	
	static private Camera camera1,camera2;
	static private Light light1,light2;
	static private Sensor sensor;
	static private Alarm alarm;
	public static void main(String[] args){
		camera1=new Camera();
		camera2=new Camera();
		light1=new Light();
		light2=new Light();
		sensor=new Sensor();
		alarm=new Alarm();
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		sensor.activate();
		alarm.activate();
	}
}
