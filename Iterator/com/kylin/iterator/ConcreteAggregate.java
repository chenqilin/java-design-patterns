package com.kylin.iterator;

public  class ConcreteAggregate extends Aggregate{
	
	/**
	 * 示意，表示聚合对象具体的内容
	 */
	private String [] ss = null;
	
	public ConcreteAggregate(String [] ss) {
		this.ss = ss;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteInerator(this);
	}
	
	/**
	 * 获取索引所对应的元素
	 * @param index 索引
	 * @return
	 */
	public Object get(int index) {
		Object obj = null;
		if(index < ss.length) {
			obj = ss[index];
		}
		return obj;
	}
	
	/**
	 * 获取聚合对象的大小
	 * @return
	 */
	public int size() {
		return this.ss.length;
	}

}
