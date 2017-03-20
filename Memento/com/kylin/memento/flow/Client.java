package com.kylin.memento.flow;

public class Client {
	public static void main(String[] args) {
		FlowAMock flowAMock = new FlowAMock("test memento");
		
		flowAMock.runPhaseOne();
		
		FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
		
		FlowAMockMemento memento = flowAMock.createMemento();
		
		careTaker.saveMemento(memento);
		
		flowAMock.schema1();
		
		flowAMock.setMemento(careTaker.retriveMemento());
		
		flowAMock.schema2();
	}
}
