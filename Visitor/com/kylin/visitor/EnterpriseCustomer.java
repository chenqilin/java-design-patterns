package com.kylin.visitor;

public class EnterpriseCustomer extends Customer {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitEnterpriseCustomer(this);
	}

}
