package com.kylin.decorator;

/**
 * 被装饰类
 * @author kylin
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method");
	}

}
