package com.modernjava.optional;

import java.util.Optional;

public class OptionalIfIsExample {

	public static void main(String[] args) {
		// isPresent
		Optional<String> stringOpt = Optional.ofNullable("HELLO World");
		if(stringOpt.isPresent())
			System.out.println(stringOpt);
		
		stringOpt.ifPresent(s -> System.out.println(s));

	}

}
