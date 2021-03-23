package com.modernjava.defaults;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC{

	public static void main(String[] args) {
		
		MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
		multipleInheritanceExample.sumA(4, 8);	// resolve to child
		multipleInheritanceExample.sumB(4, 2);
		multipleInheritanceExample.sumC(1, 2);
	
		
	}
	
	// implemented class first
	// then sub interface that extends the interface

	public void sumA(int num1, int num2){
		System.out.println("MultipleInheritance sumA " + (num1 + num2));
	}
}
