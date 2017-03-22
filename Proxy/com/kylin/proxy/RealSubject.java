package com.kylin.proxy;

/**
 * 具体主题对象
 * @author kylin
 *
 */
public class RealSubject implements Subject{

	@Override
	public void operate() {
		System.out.println("real subject is start");
	}

}
