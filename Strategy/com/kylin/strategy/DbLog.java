package com.kylin.strategy;

/**
 * 将日志记录到数据库中
 * @author kylin
 *
 */
public class DbLog implements LogStrategy{

	@Override
	public void log(String msg) {
		System.out.println("现在将消息" + msg +"记录到数据库中");
	}

}
