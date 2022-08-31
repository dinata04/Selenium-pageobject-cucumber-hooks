package com.juaracoding.pageobject.utils;

public enum TestScenarios {
	
	T1("User Chechout product");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	

}
