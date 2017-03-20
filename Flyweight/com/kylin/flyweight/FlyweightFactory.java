package com.kylin.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author kylin
 *
 */
public class FlyweightFactory {
	private Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();
	
	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = fsMap.get(key);
		
		if(flyweight == null) {
			flyweight = new ConcreteFlyweight(key);
			fsMap.put(key, flyweight);
		}
		
		return flyweight;
	}
}
