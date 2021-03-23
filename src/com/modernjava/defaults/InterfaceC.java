package com.modernjava.defaults;

public interface InterfaceC {

	default void sumC(int num1, int num2) {
		System.out.println("Interface C sumC " + (num1 + num2));
	}

}
