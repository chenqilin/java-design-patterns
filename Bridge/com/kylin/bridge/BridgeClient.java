package com.kylin.bridge;

public class BridgeClient {
	public static void main(String[] args) {
		Clothing jacket = new Jacket() ;
		
		Persion man = new Man();
		man.setClothing(jacket);
		man.dress();
	}
}
