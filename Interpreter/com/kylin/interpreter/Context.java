package com.kylin.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下问，包含解释器之外的一些全局信息
 * @author kylin
 *
 */
public class Context {
	private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
	
	public void add(AbstractExpression abstractExpression){
		list.add(abstractExpression);
	}
	
	public List<AbstractExpression> getList(){
		return list;
	}
}
