package com.modernjava.lamdba;

public class HelloWorldLambda {

	public static void main(String[] args) {
		// implementing sayHelloWorld Using Lambda
		HelloWorldInterface helloWorldInterface = () -> "Hello World";
		
		// or
		
		/*
		HelloWorldInterface helloWorldInterface = () -> {
			return "Hello World";
		};		
		*/
		
		
		System.out.println(helloWorldInterface.sayHelloWorld());
	}

}
