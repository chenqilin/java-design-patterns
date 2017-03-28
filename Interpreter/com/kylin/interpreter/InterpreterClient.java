package com.kylin.interpreter;

public class InterpreterClient {
	public static void main(String[] args) {
		Context context = new Context();
		AbstractExpression advanceExpression = new AdvanceExpression();
		AbstractExpression simpleExpression= new SimpleExpression();
		context.add(advanceExpression);
		context.add(simpleExpression);
		
		for(AbstractExpression abstractExpression : context.getList()) {
			abstractExpression.interpret(context);
		}
	}
}
