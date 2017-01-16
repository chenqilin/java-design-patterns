package com.kylin.visitor;

public class PersionCustomer extends Customer{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitPersionCustomer(this);
	}

}
