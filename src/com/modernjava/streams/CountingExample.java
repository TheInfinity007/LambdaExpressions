package com.modernjava.streams;

import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class CountingExample {

	public static void main(String[] args) {
		// count no of instructors who teaches online courses
		long count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.count();
		System.out.println(count);
		
		// Collectors.counting()
		count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.collect(Collectors.counting());
		System.out.println(count);
				
		
		

	}

}
