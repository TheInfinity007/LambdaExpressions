package com.modernjava.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {

	public static void main(String[] args) {
		// orElse
		Integer[] numbers = new Integer[10];
		numbers[0] = 15;
		Optional<Integer> number = Optional.ofNullable(numbers[0]);
		int result = number.orElse(-1);
		System.out.println(result);
		

		number = Optional.ofNullable(numbers[1]);
		result = number.orElse(-1);
		System.out.println(result);
		
		// orElseGet
		number = Optional.ofNullable(numbers[1]);
		result = number.orElseGet(() -> -1);
		System.out.println("OrElseGet = " + result);
		
		// orElse Throw
		number = Optional.ofNullable(numbers[0]);
		try {
			result = number.orElseThrow(Exception::new);
			System.out.println("Result or ElseThrow = " + result);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		

	}

}
