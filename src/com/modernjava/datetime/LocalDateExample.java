package com.modernjava.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {
		// creating local date
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate = " + localDate);
		
		// using day of the year
		localDate = LocalDate.ofYearDay(2018, 38);
		System.out.println("localDate = " + localDate);
		
		localDate = LocalDate.of(2018, 05, 23);
		System.out.println("localDate = " + localDate);
		
		// Get methods
		localDate = LocalDate.now();
		System.out.println("localDate GetMonth = " + localDate.getMonth());
		System.out.println("month count = " + localDate.getMonthValue());
		System.out.println("Day of week = " + localDate.getDayOfWeek());
		System.out.println("Day of year = " + localDate.getDayOfYear());
		System.out.println("Chronofield = " + localDate.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("Chronofield = " + localDate.get(ChronoField.MONTH_OF_YEAR));
		
	}

}
