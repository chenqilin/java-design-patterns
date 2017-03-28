package com.kylin.interpreter;

public class SimpleExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("这是普通解释器");
	}

}
