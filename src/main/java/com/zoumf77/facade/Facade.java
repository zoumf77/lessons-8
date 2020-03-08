package com.zoumf77.facade;

/**
 * 体现了把可变的地方给封装起来。
 * @author zmf
 *
 */
public class Facade {
	
	private Camera camera1,camera2;
	private Light light1,light2;
	private Sensor sensor;
	private Alarm alarm;
	
	Facade(){
		init();
	}
	
	public void  activate(){
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		sensor.activate();
		alarm.activate();
		
	}
	
	public void deactive(){
		camera1.turnOff();
		camera2.turnOff();
		light1.turnOff();
		light2.turnOff();
		sensor.deactivate();
		alarm.deactivate();
	}
	
	private void init(){
		camera1=new Camera();
		camera2=new Camera();
		light1=new Light();
		light2=new Light();
		sensor=new Sensor();
		alarm=new Alarm();
	}

}
