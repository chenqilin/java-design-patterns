package com.kylin.interpreter;

public class AdvanceExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("这是高级解释器");
	}

}
