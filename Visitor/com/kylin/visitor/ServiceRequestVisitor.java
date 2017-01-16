package com.kylin.visitor;

public class ServiceRequestVisitor implements Visitor {

	@Override
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+"提供服务");
	}

	@Override
	public void visitPersionCustomer(PersionCustomer pc) {
		System.out.println(pc.getName()+"提供服务");
	}

}
