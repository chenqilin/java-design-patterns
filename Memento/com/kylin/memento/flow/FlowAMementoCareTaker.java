package com.kylin.memento.flow;

/**
 * 负责保存模拟运行流程A的备忘录对象
 * @author kylin
 *
 */
public class FlowAMementoCareTaker {
	private FlowAMockMemento memento = null;
	
	public void saveMemento(FlowAMockMemento memento) {
		this.memento = memento;
	}
	
	public FlowAMockMemento retriveMemento(){
		return this.memento;
	}
}
