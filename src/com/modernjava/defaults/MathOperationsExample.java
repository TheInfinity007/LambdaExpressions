package com.modernjava.defaults;

public class MathOperationsExample implements Calculator{

	public static void main(String[] args) {
		MathOperationsExample mathOperationExample = new MathOperationsExample();
		System.out.println(mathOperationExample.sum(2, 4));

		
		// our implementation using lambda expression for sum
		// new way of overriding
		Calculator calculator = (num1, num2) -> num1+num2;
		System.out.println(calculator.sum(3, 2));
		
		System.out.println(mathOperationExample.subtract(5, 1));
		System.out.println(Calculator.multiply(5, 2));

	}

	// old way of overriding
	@Override
	public int sum(int num1, int num2) {		
		return num1 + num2;
	}


}
