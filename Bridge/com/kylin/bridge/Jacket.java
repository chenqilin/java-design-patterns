package com.kylin.bridge;

public  class Jacket extends Clothing {

	@Override
	public void dressCloth(Persion persion) {
		System.out.println(persion.getType() + "穿 Jacket");
	}

}
