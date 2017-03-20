package com.kylin.memento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		
		Caretaker caretaker = new Caretaker();
		
		Memento memento = originator.createMemento();
		
		caretaker.saveMemento(memento);
		
		caretaker.retriveMemento();
	}
}
