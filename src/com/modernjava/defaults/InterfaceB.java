package com.modernjava.defaults;

public interface InterfaceB extends InterfaceA{
	
	default void sumB(int num1, int num2) {
		System.out.println("Interface B sumB " + (num1 + num2));
	}
	
	default void sumA(int num1, int num2) {
		System.out.println("Interface B sumA " + (num1 + num2));
	}
	

}
