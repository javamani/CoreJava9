package com.towerplus.java8.designpattern.businessdelegate;

public class Client {
	
	public void doTask(String serviceName) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.doTask(serviceName);
	}
	
	
}
