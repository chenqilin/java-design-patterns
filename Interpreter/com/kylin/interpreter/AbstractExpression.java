package com.kylin.interpreter;

/**
 * 抽象表达式
 * @author kylin
 *
 */
public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}
