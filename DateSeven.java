package com.cts.training.date;

import java.time.LocalDate;

public class DateSeven {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate nextWeek=today.plusWeeks(1);
		System.out.println(" Date after 1 week:"+nextWeek);

	}

}
