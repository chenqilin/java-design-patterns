package com.kylin.bridge;

public class Man extends Persion {
	
	public Man() {
		setType("男人");
	}

	@Override
	public void dress() {
		getClothing().dressCloth(this);
	}

}
