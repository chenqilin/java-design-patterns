package com.kylin.visitor;

public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("AAA");
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("BBB");
		
		Customer cm3 = new PersionCustomer();
		cm3.setName("CCC");
		
		objectStructure.addElement(cm3);
		objectStructure.addElement(cm2);
		objectStructure.addElement(cm1);
		
		
		ServiceRequestVisitor serviceRequestVisitor = new ServiceRequestVisitor();
		
		objectStructure.handleRequest(serviceRequestVisitor);
	}
}
