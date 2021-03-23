package com.modernjava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		// returning all instructors sorted by their name
		List<Instructor> list = Instructors.getAll().stream()
							.sorted(Comparator.comparing(Instructor::getName))
//							.sorted(Comparator.comparing(Instructor::getName).reversed())
							.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
	}

}