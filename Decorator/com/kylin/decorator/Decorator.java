package com.kylin.decorator;

/**
 * 装饰类
 * @author kylin
 *
 */
public class Decorator implements Sourceable {
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("before decorator");
		source.method();
		System.out.println("after decorator");
	}

}
