package com.modernjava.defaults;

public interface InterfaceD {
	
	default void sumA(int num1, int num2) {
		System.out.println("Interface A sumA " + (num1 + num2));
	}
}
