package com.kylin.observer;

/**
 * 具体观察者
 * @author
 *
 */
public class WeixinUser implements Observer {
	String name;
	public WeixinUser(String name) {
		this.name = name;
	}
	@Override
	public void update(String str) {
		System.out.println("WeixinUser:" + str);
	}

}
