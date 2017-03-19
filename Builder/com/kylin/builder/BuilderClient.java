package com.kylin.builder;

public class BuilderClient {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();
		
		waiter.getpPizza();
	}
}
