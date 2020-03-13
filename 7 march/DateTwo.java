package com.cts.training.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Date;

public class DateTwo {
	public static void main(String[] args) {
		
	Date date=new Date();
	System.out.println("How to check if two dates are equal");
	LocalDate today=LocalDate.now();
	
	LocalDate birthday=LocalDate.of(1998, 07, 07);
	MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
	MonthDay today1=MonthDay.from(today);
	if(birth.equals(today1))
	{
		System.out.println("Matched");
	}
	else
	{
		System.out.println("Not Matched");
	}
}
}