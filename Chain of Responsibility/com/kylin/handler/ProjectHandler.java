package com.kylin.handler;


public class ProjectHandler extends Handler {

	@Override
	public void doHandler() {
		//处理该类逻辑
		System.out.println("ProjectHandler");
		if(getNextHandler() != null ) {
			getNextHandler().doHandler();
		}
	}

}
