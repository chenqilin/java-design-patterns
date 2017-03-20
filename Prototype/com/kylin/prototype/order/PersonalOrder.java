package com.kylin.prototype.order;

/**
 * 个人订单对象，利用Java的clone功能
 * @author kylin
 *
 */
public class PersonalOrder implements Cloneable {
	private String customerName;
	
	private String productid;
	
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}
	
	
}
