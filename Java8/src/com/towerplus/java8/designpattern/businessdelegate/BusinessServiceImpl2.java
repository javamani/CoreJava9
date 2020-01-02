package com.towerplus.java8.designpattern.businessdelegate;

public class BusinessServiceImpl2 implements BusinessServiceInterface {

	public String doProcessing() {
		System.out.println("Service two Implementation performed");
		return "good start";
	}
}
