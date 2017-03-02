package com.kylin.memento;
/**
 * 负责被保存的备忘录对象
 * 备忘录管理着对象
 * @author kylin
 *
 */
public class Caretaker {
	/**
	 * 记录被保存的备忘录对象
	 */
	private Memento memento = null;
	
	/**
	 * 保存备忘录对象
	 * @param memento 被保存的备忘录对象
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	/**
	 * 
	 * @return
	 */
	public Memento retriveMemento() {
		return this.memento;
	}
}
