package com.kylin.handler;

public class HandlerClient {
	public static void main(String[] args) {
		ProjectHandler projectHandler = new ProjectHandler();
		ManagerHandler managerHandler = new ManagerHandler();
		projectHandler.setNextHandler(managerHandler);
		
		projectHandler.doHandler();
	}
}
