package com.modernjava.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class GroupingExample3 {
	public static void main(String[] args) {
		// grouping by length of a string and also checking that their names contains e and only return those names
		List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
		LinkedHashMap<Integer, List<String>> map = name.stream()
				.collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors
						.filtering(s -> s.contains("e"), Collectors.toList())));
		System.out.println(map);
		System.out.println("-----------------------------------");
		
		// instructor grouping then by senior > 10 and junior < 10 and filter them on online courses
		LinkedHashMap<String, List<Instructor>> result = Instructors.getAll().stream()
				.collect(Collectors.groupingBy((instructor) -> {
					return instructor.getYearsOfExperience() > 10 ? "SENIOR": "JUNIOR";
				}, LinkedHashMap::new, Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())));
		result.forEach((key, value)->{
			System.out.println(key + " " + value);
		});
	}
}
