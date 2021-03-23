package com.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		// sum
		int sum = IntStream.rangeClosed(0, 1000).sum();
		System.out.println(sum);
		System.out.println("--------------------------");
		
		OptionalInt min = IntStream.rangeClosed(0, 1000).min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		System.out.println("--------------------------");
		
		OptionalInt max = IntStream.rangeClosed(0, 1000).max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		System.out.println("--------------------------");
		
		OptionalDouble avg = IntStream.rangeClosed(0, 1000).asDoubleStream().average();
		System.out.println((avg.isPresent()? avg.getAsDouble(): 0.0));
		System.out.println("--------------------------");

	}

}
