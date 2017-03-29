package com.kylin.iterator;

/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 * @author kylin
 *
 */
public abstract class Aggregate {
	
	/**
	 * 工厂方法，创建现有迭代器对象的接口
	 * @return
	 */
	public abstract Iterator createIterator();
}
