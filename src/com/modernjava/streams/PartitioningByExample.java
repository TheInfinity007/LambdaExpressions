package com.modernjava.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class PartitioningByExample {

	public static void main(String[] args) {
		// partition instructors in two groups 
		// years of experience > 10 and other is <= 10
		Predicate<Instructor> experiencePredicate = (instructor) -> instructor.getYearsOfExperience() > 10;
		Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(experiencePredicate));
		partitionMap.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		System.out.println("--------------------");
		
		// partition but return is set instead of list
		Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));
		partitionSet.forEach((k, v)->{
			System.out.println(k + " " + v);
		});
		
		
	}

}
