package com.kylin.singleton;

/**
 * 饿汉模式
 * 饿汉模式是典型的空间换时间，当类装载的时候就会创建类实例
 * @author kylin
 *
 */
public class SingletonB {
	private static SingletonB singletonB = new SingletonB();
	
	public SingletonB() {
	}
	
	public static SingletonB getInstance() {
		return singletonB;
	}
}
