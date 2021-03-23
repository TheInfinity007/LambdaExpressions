package com.modernjava.streams;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class GroupingMinMaxAverageExample {

	public static void main(String[] args) {
		// grouping the instructors in two sets of online courses vs not online
		// and also get the max years of experience
		
		Map<Boolean, Optional<Instructor>> maxInstructor = Instructors.getAll().stream()
					.collect(Collectors.groupingBy(Instructor::isOnlineCourses,
							Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
		maxInstructor.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		System.out.println();
		
		// collectingAndThen
		Map<Boolean, Instructor> maxInstructor1 = Instructors.getAll().stream()
			.collect(Collectors.groupingBy(Instructor::isOnlineCourses,
					Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
						Optional::get
					)
			));
		maxInstructor1.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		System.out.println("----------------------------");
		
		
		// average years of experience who teaches online or not
		Map<Boolean, Double> maxInstructor2 = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::isOnlineCourses,
							Collectors.averagingInt(Instructor::getYearsOfExperience)
				));
		maxInstructor2.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		System.out.println("----------------------------");
		
		
		// drive a statistical summary from properties of grouped items
		Map<Boolean, IntSummaryStatistics> maxInstructor3 = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::isOnlineCourses,
							Collectors.summarizingInt(Instructor::getYearsOfExperience)
				));
		maxInstructor3.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		

	}

}
