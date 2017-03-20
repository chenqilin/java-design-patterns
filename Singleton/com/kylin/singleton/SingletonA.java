package com.kylin.singleton;

/**
 * 懒汉模式
 * @author kylin
 *
 */
public class SingletonA {
	private static SingletonA singletonA;
	public SingletonA() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 非线程安全，需要加同步锁
	 * @return
	 */
	public static synchronized SingletonA getInstance() {
		if (singletonA == null) {
			singletonA = new SingletonA();
		}
		return singletonA;
	}
}
