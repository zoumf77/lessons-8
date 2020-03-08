package com.zoumf77;

/*简单工厂模式，如果要增加一个产品即说英语的类的话，工厂代码需要改变 */

/*通常通过参数来决定创建出哪一个产品类的*/
/*
 * 工厂类角色
 * 抽象产品角色
 * 具体产品角色
 * 如果三个三个角色合为一个的话， 简单工厂模式退化就成单例模式 
 **/

/**
 * 开闭原则：
 * 开：可以增加新的品种，即本程序中，添加说法语的产品
 * 闭：客户端程序只需要申请需要什么样的语言，不需要修改代码；
 * 但是工厂类会随着产品的增加而修改，
 * 所以只在有限程度上支持了“开闭-原则”
 * @author zmf
 *
 */

public class SimpleFactory {
	
	/*依赖倒转，这个方法返回只依赖接口*/
	public static ISayHi getSayHi(String language){
		
		if("en".equals(language))
			return new ISayHiEnglishImpl();
		else
			return new ISayHiChineseImpl();
	}

}

