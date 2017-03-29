package com.kylin.iterator;

public class IteratorClient {
	public static void main(String[] args) {
		String [] names = {"张三" , "李四"};
		
		Aggregate aggregate = new ConcreteAggregate(names);
		
		Iterator iterator = aggregate.createIterator();
		
		iterator.first();
		
		while(!iterator.isDone()) {
			Object obj = iterator.currentItem();
			System.out.println(obj);
			iterator.next();
		}
	}
}
