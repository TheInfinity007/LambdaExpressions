package com.modernjava.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Hello World");
		System.out.println(optionalString);
		
		System.out.println(getWords());
	}
	
	public static Optional<String> getWords(){
		String[] words = new String[10];
		words[1] = "Test";
		Optional<String> optionals = Optional.ofNullable(words[1]);
		if(optionals.isPresent())
			return optionals;
		return Optional.empty();
	}

}
