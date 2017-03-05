package com.kylin.prototype;

public class PrototypeManagerClient {
	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("p1", p1);
		
		Prototype p2 = PrototypeManager.getPrototype("p1").clone();
		p2.setName("张三");
		System.out.println(p2.toString());
		
		Prototype p3 = PrototypeManager.getPrototype("p1").clone();
		p3.setName("李四");
		System.out.println(p3.toString());
		
		Prototype p4 = PrototypeManager.getPrototype("p1").clone();
		p4.setName("王五");
		System.out.println(p4.toString());
		
	}
}
