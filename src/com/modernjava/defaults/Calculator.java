package com.modernjava.defaults;

@FunctionalInterface
public interface Calculator {
	// abstract
	public int sum(int num1, int num2);
	
//	 abstract
//	public int divide(int num1, int num2);
	
	// default method
	default int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	// static method
	static int multiply(int num1, int num2) {
		return num1*num2;
	}
}
