package com.towerplus.java8.designpattern.businessdelegate;

public class BusinessLookupService {
	
	public BusinessServiceInterface getBusinessDelegateObj(String serviceType) {
		
		if(serviceType.equalsIgnoreCase("service1")) {
			return new BusinessServiceImpl1();
		} 
		else if (serviceType.equalsIgnoreCase("service2")) {
			return new BusinessServiceImpl2();
		}
		return null;
	}

}
