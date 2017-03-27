package com.kylin.bridge;

public class Trouser extends Clothing{

	@Override
	public void dressCloth(Persion persion) {
		System.out.println(persion.getType() + " 穿 Trouser");
	}

}
