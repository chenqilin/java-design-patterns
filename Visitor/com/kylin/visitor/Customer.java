package com.kylin.visitor;

public abstract class Customer {
	private String customerId;
	
	private String name;
	
	
	public abstract void accept(Visitor visitor);

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
