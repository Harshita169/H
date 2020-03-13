package com.cts.training.date;

import java.time.LocalDate;

public class DateThree {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate birthday=LocalDate.of(1998, 07, 07);
	
	if(birthday.equals(today))
	{
		System.out.println("Equal");
	}
	else
	{
		System.out.println("Dates are not Equal");
	}
}
}

