package com.kylin.flyweight;

/**
 * 享元接口，通过这个接口享元可以接受并作用于外部状态
 * @author kylin
 *
 */
public interface Flyweight {
	public void operation(String extrinsicState);
}
