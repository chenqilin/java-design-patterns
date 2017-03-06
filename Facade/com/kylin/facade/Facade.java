package com.kylin.facade;

public class Facade {
	public void test(){
		AModuleApi aapi = new AModuleImpl();
		aapi.testA();
		BModuleApi bapi = new BModuleImpl();
		bapi.testB();
		CModuleApi capi = new CModuleImpl();
		capi.testC();
	}
}
