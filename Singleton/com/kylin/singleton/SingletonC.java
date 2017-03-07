package com.kylin.singleton;

public class SingletonC {
	public SingletonC() {
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHolder {
		private static SingletonC singletonC = new SingletonC();
	}
	
	public static SingletonC getInstance(){
		return SingletonHolder.singletonC;
	}
}
