package com.kylin.visitor;

public interface Visitor {
	
	void visitEnterpriseCustomer(EnterpriseCustomer ec);
	
	void visitPersionCustomer(PersionCustomer pc); 
}
