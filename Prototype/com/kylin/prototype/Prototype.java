package com.kylin.prototype;

/**
 * 声明一个克隆自身的接口
 * @author kylin
 *
 */
public interface Prototype {
	/**
	 * 克隆自身的方法
	 * @return 一个从自身克隆出来的对象
	 */
	public Prototype clone();
	
	public void setName(String name);
}
