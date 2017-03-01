package com.kylin.strategy;

public class Client {
	public static void main(String[] args) {
		LogStrategy logStrategy = new DbLog();
		
		LogContext logContext = new LogContext(logStrategy);
		logContext.recordLog("测试策略模式");
	}
}
