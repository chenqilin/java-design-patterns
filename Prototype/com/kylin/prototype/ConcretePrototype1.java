package com.kylin.prototype;

/**
 * 克隆的具体实现对象
 * @author kylin
 *
 */
public class ConcretePrototype1 implements Prototype{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Prototype clone() {
		ConcretePrototype1  prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}
	
	@Override
	public String toString() {
		return "Now in prototype1, name = " + name;
	}

}
