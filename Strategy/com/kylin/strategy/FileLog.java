package com.kylin.strategy;

public class FileLog implements LogStrategy{

	@Override
	public void log(String msg) {
		System.out.println("现在将消息" + msg +"记录到文件中库中");
	}

}
