package com.kylin.builder;

public class Waiter {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getpPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
