package com.modernjava.lamdba;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{

	public static void main(String[] args) {
		IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
		System.out.println(incrementByFiveTraditional.incrementByFive(2));
	}
	
	@Override
	public int incrementByFive(int a) {
		return a+5;
	}

	

}
