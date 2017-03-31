package com.kylin.handler;

public class ManagerHandler extends Handler{

	@Override
	public void doHandler() {
		System.out.println("ManagerHandler is runing");
		
		if(getNextHandler() != null) {
			getNextHandler().doHandler();
		}
	}

}
