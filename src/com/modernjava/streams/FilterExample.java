package com.modernjava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class FilterExample {

	public static void main(String[] args) {
		// return instructors sorted by their namList<A>d have more than 10 years of experience
		
		List<Instructor> list = Instructors.getAll().stream()
							.filter(instructor -> instructor.getYearsOfExperience() > 10)
							.sorted(Comparator.comparing(Instructor::getName))
							.collect(Collectors.toList());
		
		list.forEach(System.out::println);
							
	}

}
