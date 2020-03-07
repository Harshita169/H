package com.cts.training.date;

import java.time.LocalDate;

public class DateOne {
	public static void main(String[] args) {
		
	
	System.out.println("Current day, month and year");
	LocalDate date=LocalDate.now();
	int day=date.getDayOfMonth();
	int month=date.getMonthValue();
	int year=date.getYear();
	System.out.println("Day:"+day+" Month:"+month+" Year"+year);
}
}