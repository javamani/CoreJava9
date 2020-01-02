package com.towerplus.java8.designpattern.businessdelegate;

public class BusinessServiceImpl1 implements BusinessServiceInterface {

	public String doProcessing() {
		System.out.println("Service one Implementation performed");
		return "good start";
	}
}
