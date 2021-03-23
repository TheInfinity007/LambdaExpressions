package com.modernjava.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		// Date and simple date formatter - old
		
		Date dateObj = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("df.format = " + df.format(dateObj));
		
		df = new SimpleDateFormat("HH:mm:ss");
		System.out.println("df.format = " + df.format(dateObj));
		
		System.out.println(Calendar.getInstance().getTime());
		
		// new libraries
		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Local " + localDate);
		
		// localTime
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time " + localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local DAte time " + localDateTime);
		
		

	}

}
