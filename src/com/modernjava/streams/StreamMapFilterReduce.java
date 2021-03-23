package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class StreamMapFilterReduce {

	public static void main(String[] args) {
		// total years of experience between instructors
		int result = Instructors.getAll().stream()
					.map(Instructor::getYearsOfExperience)
//					.reduce(0, (a, b) -> a+b)
					.reduce(0, Integer::sum);
		
		System.out.println(result);
	}

}
