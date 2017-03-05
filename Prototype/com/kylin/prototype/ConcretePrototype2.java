package com.kylin.prototype;

/**
 * 克隆方法的具体实现
 * @author kylin
 *
 */
public class ConcretePrototype2 implements Prototype{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   public Prototype clone() {
	   Prototype prototype = new ConcretePrototype2();
	   return prototype;
   }
}
