package com.towerplus.java8.designpattern.businessdelegate;

public class BDMain {

	public static void main(String args[]) {		
		
		Client client = new Client();
		
		client.doTask("service1");
		
		client.doTask("service2");
		
	}
	
}
