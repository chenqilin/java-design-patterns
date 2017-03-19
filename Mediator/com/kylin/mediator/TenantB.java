package com.kylin.mediator;

public class TenantB extends Tenant{

	public TenantB(RealEstateAgents realEstateAgents) {
		super(realEstateAgents);
	}

	@Override
	public void crying() {
		System.out.println("是高富帅 TenantB！哎呀我想要！");
	}

}
