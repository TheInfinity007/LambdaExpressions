package com.modernjava.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class CollectorMappingExample {

	public static void main(String[] args) {
		// map
		List<String> namesList = Instructors.getAll().stream()
							.map(Instructor::getName)
							.collect(Collectors.toList());
		System.out.println(namesList);
		
		// mapping
		namesList = Instructors.getAll().stream()
					.collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
					
		System.out.println(namesList);	
		
		// group Instructors by their years of experience
		Map<Integer, List<String>> map = Instructors.getAll().stream()
			.collect(Collectors.groupingBy(Instructor::getYearsOfExperience, 
					Collectors.mapping(Instructor::getName, Collectors.toList())));

		System.out.println(map);
		
	}

}
