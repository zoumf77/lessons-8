package com.zoumf77.template;

/**
 * 顶级类
 * 两个重要角色
 * 1）：模版方法，一般是个具体方法，定义了顶级逻辑框架，顶级逻辑框架可以有多个基本方法来完成。
 * 2）：基本方法，有一个或者多个，可以在顶级类已经实现，个性化的基本方法是抽象方法，子类必须实现。
 * @author 阎宏博士
 *
 */

abstract public class AbstractClass {
	
	/**
	 * 模版方法的声明与实现
	 */
	public void TemplateMethod(){
		//调用基本方法(由子类实现)
		doOperation1();
		
		//调用基本方法(由子类实现）
		doOperation2();
		
		//调用基本方法（已经实现)
		doOperation3();
	}

	/**
	 * 基本方法的声明(由子类实现）
	 */
	protected abstract void doOperation1();
	
	/**
	 * 基本方法的声明(由子类实现）
	 */
	protected abstract void doOperation2();
	
	/**
	 * 基本方法(已经实现）
	 */
	private final void doOperation3(){
		//do something
	}
	
}
