package com.modernjava.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		
		Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
		Function<Integer, Double> sqrt1 = Math::sqrt;
		
		Function<String, String> lowerFxn = s1 -> s1.toLowerCase();
		Function<String, String> lowerFxn1 = String::toLowerCase;
		
				
	}

}
