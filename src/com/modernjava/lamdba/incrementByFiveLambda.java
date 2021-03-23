package com.modernjava.lamdba;

public class incrementByFiveLambda {

	public static void main(String[] args) {
		IncrementByFiveInterface incrementByFiveInterface = (x) -> x+5;
		System.out.println(incrementByFiveInterface.incrementByFive(3));
	}
}
