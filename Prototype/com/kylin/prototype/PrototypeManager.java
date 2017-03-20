package com.kylin.prototype;

import java.util.HashMap;
import java.util.Map;


/**
 * 原型管理器
 * @author kylin
 *
 */
public class PrototypeManager {
	/**
	 * 用来记录原型的编号和原型实例的对应关系
	 */
	private static Map<String, Prototype> map = new HashMap<String, Prototype>();
	
	private PrototypeManager(){
		
	}
	
	public synchronized static void setPrototype(String prototypeId,Prototype prototype){
		map.put(prototypeId, prototype);
	}
	
	public synchronized static void removePrototype(String prototypeId){
		map.remove(prototypeId);
	}
	
	public synchronized static Prototype getPrototype(String prototypeId){
		return map.get(prototypeId);
	}
}
