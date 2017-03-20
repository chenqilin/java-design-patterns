package com.kylin.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		System.out.println("Hawaiian Dough");
		pizza.setDough("Hawaiian Dough");
	}

	@Override
	public void buildSauce() {
		System.out.println("Hawaiian Sauce");
		pizza.setSauce("Hawaiian Sauce");
	}

	@Override
	public void buildTopping() {
		System.out.println("Hawaiian Topping");
		pizza.setTopping("Hawaiian Topping");
	}

}
