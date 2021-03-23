package com.modernjava.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		localTime = LocalTime.of(15, 18);
		System.out.println(localTime);
		
		localTime = LocalTime.of(15,  18, 22);
		System.out.println(localTime);
		
		localTime = LocalTime.of(15, 18, 23, 22222222);
		System.out.println(localTime);
		
		// get
		System.out.println("get hour " + localTime.getHour());
		System.out.println("get min " + localTime.getMinute());
		System.out.println("get seocnd " + localTime.getSecond());
		
		// chrono field
		System.out.println("Second of the day " + localTime.get(ChronoField.SECOND_OF_DAY));
		System.out.println("MInute of the day " + localTime.get(ChronoField.MINUTE_OF_DAY));

	}

}
