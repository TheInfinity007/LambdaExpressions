package com.modernjava.streams;

import java.util.Set;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class MapExample {

	public static void main(String[] args) {
		// return only instructor name from the instructor list
		Set<String> instructorNames = Instructors.getAll().stream()
									.peek(s -> System.out.println(s))
									.map(Instructor::getName)
									.peek(s -> System.out.println(s))
									.map(String::toUpperCase)
									.peek(s -> System.out.println(s))
									.collect(Collectors.toSet());
		
		System.out.println(instructorNames);
	}

}
