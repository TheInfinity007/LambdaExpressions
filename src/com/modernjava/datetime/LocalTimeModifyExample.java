package com.modernjava.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeModifyExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(localTime.plusHours(2));
		System.out.println(localTime.plusMinutes(2));
		System.out.println(localTime.plusSeconds(2));
		System.out.println(localTime.plusNanos(50));
		
		System.out.println(localTime.minusHours(2));
		System.out.println("-------------------------");
		System.out.println(localTime.minus(2, ChronoUnit.HOURS));

		
		System.out.println("Mid " + localTime.MIDNIGHT);
		System.out.println("Chronofield hour of day " + localTime.with(ChronoField.HOUR_OF_DAY, 4));
	}

}
