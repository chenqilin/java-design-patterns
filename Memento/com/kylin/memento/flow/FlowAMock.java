package com.kylin.memento.flow;

public class FlowAMock {
	private String flowName;
	
	private int tempResult;
	
	private String tempState;
	
	public FlowAMock(String flowName) {
		this.flowName = flowName;
	}
	
	/**
	 * 示意，运行流程的第一阶段
	 */
	public void runPhaseOne() {
		tempResult = 3;
		tempState = "PhaseOne";
	}
	
	public void schema1() {
		System.out.println(flowName + "schema1 is runing");
	}
	
	public void schema2() {
		System.out.println(flowName + "schema2 is runing");
	}
	
	/**
	 * 创建保存原发器对象状态的备忘录对象
	 * @return 创建好的备忘录对象
	 */
	public FlowAMockMemento createMemento() {
		return new MementoImpl(tempResult, tempState);
	}
	
	public void setMemento(FlowAMockMemento memento){
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.tempResult = mementoImpl.getTempResult();
		this.tempState = mementoImpl.getTempState();
	}
	
	private  class MementoImpl implements FlowAMockMemento {
		/**
		 * 保留某个中间结果
		 */
		private int tempResult;
		
		/**
		 * 保留某个中间结果
		 */
		private String tempState;
		
		public MementoImpl(int tempResult,String tempState) {
			this.tempResult = tempResult;
			this.tempState = tempState;
		}
		
		public int getTempResult() {
			return tempResult;
		}
		
		public String getTempState() {
			return tempState;
		}
	}
}
