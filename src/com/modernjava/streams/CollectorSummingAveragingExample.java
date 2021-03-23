package com.modernjava.streams;

import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class CollectorSummingAveragingExample {

	public static void main(String[] args) {
		
		// sum of years of experience of all 
		int sum = Instructors.getAll().stream()
				.collect(Collectors.summingInt(Instructor::getYearsOfExperience));
		System.out.println(sum);
		
		double average = Instructors.getAll().stream()
					.collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
		System.out.println(average);
		
	}

}
