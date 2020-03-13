package com.cts.training.date;

import java.time.LocalDate;
import java.time.MonthDay;

public class DateFour {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate birthday=LocalDate.of(1998,07,07);
	MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
	MonthDay current=MonthDay.from(today);
	if(birth.equals(current))
	{
		System.out.println("Happy Birthday");
	}
	else
	{
		System.out.println("Dates are not Equal");
	}
}
}

