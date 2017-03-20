package com.kylin.memento;

/**
 * 原发器对象
 * @author kylin
 *
 */
public class Originator {
	/**
	 * 示意，表示原发器的状态
	 */
	private String state = "";
	
	/**
	 * 创建保存原发器对象的状态的备忘录对象
	 * @return
	 */
	public Memento createMemento() {
		return new MementoImpl(state);
	}
	
	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.state = mementoImpl.getState();
	}
	
	/**
	 * 备忘录对象
	 * 真正的备忘录对象，实现备忘录窄接口
	 * 实现成私有的内部类，不让外部访问
	 */
	private static class MementoImpl implements Memento {
		/**
		 * 示意，表示需要保存的状态
		 */
		private String state = "";
		
		public MementoImpl(String state) {
			this.state = state;
		}

		public String getState() {
			return state;
		}
		
	}
	
}
