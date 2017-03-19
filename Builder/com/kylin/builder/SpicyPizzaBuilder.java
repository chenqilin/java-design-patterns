package com.kylin.builder;

public class SpicyPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		System.out.println("SpicyPizzaBuilder Dough");
		pizza.setDough("SpicyPizzaBuilder Dough");
	}

	@Override
	public void buildSauce() {
		System.out.println("SpicyPizzaBuilder Sauce");
		pizza.setSauce("SpicyPizzaBuilder Sauce");
	}

	@Override
	public void buildTopping() {
		System.out.println("SpicyPizzaBuilder Topping");
		pizza.setTopping("SpicyPizzaBuilder Topping");
	}

}
