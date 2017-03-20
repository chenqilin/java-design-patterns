package com.kylin.mediator;

public abstract class Tenant {
	RealEstateAgents realEstateAgents;
	
	public Tenant(RealEstateAgents realEstateAgents) {
		this.realEstateAgents = realEstateAgents;
	}
	
	public abstract void crying();
/*	
	public void renting(){
		realEstateAgents.sell(this);
	}*/
}
