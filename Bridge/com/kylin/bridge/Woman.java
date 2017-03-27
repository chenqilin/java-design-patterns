package com.kylin.bridge;

public class Woman extends Persion {
	public Woman() {
		setType("女人");
	}
	
	@Override
	public void dress() {
		getClothing().dressCloth(this);
	}

}
