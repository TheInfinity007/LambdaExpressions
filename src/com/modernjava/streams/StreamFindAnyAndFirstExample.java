package com.modernjava.streams;

import java.util.Optional;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class StreamFindAnyAndFirstExample {

	public static void main(String[]args) {
		Optional<Instructor> instructor = Instructors.getAll().stream().findAny();
		if(instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		
		instructor = Instructors.getAll().stream().findFirst();
		if(instructor.isPresent()) {
			System.out.println(instructor.get());
		}

	}

}
