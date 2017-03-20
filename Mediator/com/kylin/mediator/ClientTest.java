package com.kylin.mediator;

public class ClientTest {
	 public static void main(String[] args) {
	        RealEstateAgents agent = new RealEstateAgents();
	        agent.createAgents();
	        
	        System.out.println("TeA 抢到了房子了！");
	        agent.sell(new TenantA(agent));
	        
	        System.out.println("过了两个月 TeB 抢到了房子了！");
	        agent.sell(new TenantB(agent));
	    }
}
