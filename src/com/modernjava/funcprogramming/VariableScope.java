package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScope {

	static int k = 0;	// will not give error
	public static void main(String[] args) {
		int b = 10;
		IntConsumer intConsumer = (a) -> System.out.println(a*10);
		
		List<Instructor> instructors = Instructors.getAll();
		instructors.forEach(instructor -> {
//			System.out.println(instructor);
//			System.out.println(instructor + (k++)); give error
			System.out.println(instructor + " " + k);
		});
		
		k = 5;
		
	}

}
