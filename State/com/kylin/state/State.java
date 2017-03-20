package com.kylin.state;

/**
 * 封装与context 的一个特定状态相关的行为
 * @author kylin
 *
 */
public interface State {
	/**
	 * 状态应对的处理
	 * @param sampleParameter
	 */
	public void handle(String sampleParameter);
}
