package com.kylin.mediator;

public class TenantA extends Tenant{
	public TenantA(RealEstateAgents realEstateAgents) {
		super(realEstateAgents);
	}

	@Override
	public void crying() {
		System.out.println("是高富帅 TenantA！哎呀我想要！");
	}

}
