package com.kylin.template;

public abstract class Beverage {
	public final void create() {
		boilWater();
		addCoundiments();
		pourInCup();
	}
	public abstract void addCoundiments();
	
	public void boilWater() {
		System.out.println("煮开水");
	}
	
	public void pourInCup() {
		System.out.println("倒入杯子");
	}
}
