package com.modernjava.funcprogramming;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// if no is > 10 return true other false
		Predicate<Integer> p1 = (i) -> i > 10;
		System.out.println(p1.test(100));
		
		// i > 10 && number is even number
		Predicate<Integer> p2 = (i) -> i%2 == 0;
		System.out.println(p1.and(p2).test(21));
		
		// i > 10 || i is even number
		System.out.println(p1.or(p2).test(2));
		
		// i > 10 && number is odd
		System.out.println(p1.and(p2.negate()).test(33));
		
		
	}

}
