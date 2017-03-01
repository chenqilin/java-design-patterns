package com.kylin.strategy;

/**
 * 日志记录的上下文
 * @author kylin
 *
 */
public class LogContext {
	private LogStrategy logStrategy = null;
	
	public LogContext(LogStrategy logStrategy) {
		this.logStrategy = logStrategy;
	}
	
	public void recordLog(String msg) {
		this.logStrategy.log(msg);
	}
}
