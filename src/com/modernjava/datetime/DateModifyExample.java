package com.modernjava.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		// after 4 days from now
		localDate = localDate.plusDays(4);
		System.out.println("Local date " + localDate);
		System.out.println("4 days after " + localDate.plusDays(4));
		
		localDate = LocalDate.now();
		System.out.println("Local date " + localDate);
		System.out.println("2 month after " + localDate.plusMonths(2));
		System.out.println("2 years after " + localDate.plusYears(2));
		System.out.println("10 days before " + localDate.minusDays(10));
		System.out.println("with year 2023 = " + localDate.withYear(2023));
		
		//
		System.out.println("With Chronofield " + localDate.with(ChronoField.YEAR, 2025));
		System.out.println("With temporal adjusters " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
	}

}
