package com.modernjava.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactorMethodExample {
	public static void main(String[] args) {
		// of
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		stream.forEach(System.out::print);
		
		System.out.println("\n-----------------");
		
		// iterate generate a stream of 10 even no's
		Stream<Integer> stream1 = Stream.iterate(0, i -> i+2).limit(10);
		
		stream1.forEach(System.out::println);
		
		System.out.println("\n-----------------");
		
		// iterate generate a stream of 10 even no's
		Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(10);
		
		stream2.forEach(System.out::println);
		
		
		
	}
}
