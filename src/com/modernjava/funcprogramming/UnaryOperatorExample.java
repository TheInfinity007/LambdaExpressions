package com.modernjava.funcprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i -> i*10;
		System.out.println(unary.apply(6));
		
		Function<Integer, Integer> function = i -> i*10;
		System.out.println(function.apply(6));
		
		IntUnaryOperator intUnaryOperator = i -> i*10;
		System.out.println(intUnaryOperator.applyAsInt(100));
		
		LongUnaryOperator longUnaryOperator = i -> i*10;
		System.out.println(longUnaryOperator.applyAsLong(100000));
		
		DoubleUnaryOperator doubleUnaryOperator = i -> i*10;
		System.out.println(doubleUnaryOperator.applyAsDouble(200000.20000000));
	}
	
	

}
