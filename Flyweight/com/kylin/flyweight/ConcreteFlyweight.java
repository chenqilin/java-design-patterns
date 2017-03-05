package com.kylin.flyweight;

/**
 * 享元对象
 * @author kylin
 *
 */
public class ConcreteFlyweight implements Flyweight{
	/**
	 * 示例，描述内部状态
	 */
	private String intrinsicState;
	
	public ConcreteFlyweight(String state) {
		this.intrinsicState = state;
	}
	
	@Override
	public void operation(String extrinsicState) {
		//具体操作
	}

}
