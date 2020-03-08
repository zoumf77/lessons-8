package com.zoumf77;

public class Client {
	
	public static void main(String[] args){
		
		/*依赖反转*/
		ISayHi hi=new ISayHiChineseImpl();
		hi.sayHello();
		
		/*简单工厂模式*/
		ISayHi hi_1=SimpleFactory.getSayHi("en");
		hi_1.sayHello();
		
		/*工厂方法模式*/
		/*一定返回的是抽象类型*/
		/*一定返回的是工厂自己创建的对象*/
		/*新增一个法语问候的类，只需要增加一个具体法语工厂和一个说法语的类 */
		/*抽象工厂无需改变*/
		
		IFactory f=new FactoryChinese();
		f.getSayHi().sayHello();
	}
}
