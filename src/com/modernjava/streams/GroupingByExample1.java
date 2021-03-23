package com.modernjava.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class GroupingByExample1 {

	public static void main(String[] args) {
		// group list of name by length
		List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
		Map<Integer, List<String>> map = names.stream()
								.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		System.out.println("-------------------------");
		
		// grouping by instructors by their genders
		Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream()
					.collect(Collectors.groupingBy(Instructor::getGender));
		instructorByGender.forEach((key, value) -> {
			System.out.println(key + " " + value);			
		});
		
		// grouping by > 10 years of experience is classified as senior and others are juniors
		Map<String, List<Instructor>> instructorByExperience = Instructors.getAll().stream()
					.collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10? "Senior": "Junior"));
		
		instructorByExperience.forEach((key, value) -> {
			System.out.println(key + " " + value);			
		});

	}

}
