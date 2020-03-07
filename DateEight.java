package com.cts.training.date;

import java.time.LocalDate;

public class DateEight {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate year=today.plusYears(1);
	System.out.println(" Date after 1 year:"+year);
	LocalDate year1=today.minusYears(1);
	System.out.println(" Date after 1 year:"+year1);
}
}
