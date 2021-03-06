package com.modernjava.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		System.out.println("Sequentioal " + sumSequentialStream());
		System.out.println("Parallel " + sumParallelStream());

	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 50000).sum();
	}
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 50000).parallel().sum();
	}

}
