package com.kylin.mediator;

public class RealEstateAgents implements StateMediator{
	TenantA tenantA;
	TenantB tenantB;

	@Override
	public void sell(Tenant tenant) {
		if(tenant instanceof TenantA) {
			tenantB.crying();
		}
		if (tenant instanceof TenantB) {
			tenantA.crying();
		}
	}
	
	public void createAgents() {
		tenantB = new TenantB(this);
		tenantA = new TenantA(this);
	}

}
