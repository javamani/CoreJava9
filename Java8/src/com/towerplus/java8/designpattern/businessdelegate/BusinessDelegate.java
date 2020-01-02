package com.towerplus.java8.designpattern.businessdelegate;

public class BusinessDelegate {
	
	private BusinessLookupService businessLookupService = new BusinessLookupService();
	
	public void doTask(String serviceName) {
		BusinessServiceInterface businessService = businessLookupService.getBusinessDelegateObj(serviceName);
		businessService.doProcessing();		
	}

}
