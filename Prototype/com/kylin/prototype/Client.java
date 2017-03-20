package com.kylin.prototype;

/**
 * 使用原型的克隆模式
 * @author kylin
 *
 */
public class Client {
	/**
	 * 持有需要使用的原型接口对象
	 */
	private Prototype prototype;
	
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
	/**
	 * 示意方法，执行某个功能操作
	 */
	public void operation(){
		//需要创建原型接口的对象
		Prototype newPrototype = prototype.clone();
	}
	
	public static void main(String[] args) {
		
	}
}
