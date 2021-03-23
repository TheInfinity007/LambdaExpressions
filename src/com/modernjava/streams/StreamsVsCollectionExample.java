package com.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsVsCollectionExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("Syed");
		names.add("Rajeev");
		System.out.println("-------------");
		System.out.println(names);
		
		names.remove("Syed");
		System.out.println("-------------------");
		System.out.println(names);
		
		for(String name: names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		

		System.out.println("--------------------");
		Stream<String> namesStream2 = names.stream();
		namesStream2.filter(s -> s.startsWith("M")).collect(Collectors.toList());
//		namesStream2.forEach(System.out::println);

		
		
	}

}
