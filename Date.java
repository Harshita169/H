package com.cts.training.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
public static void main(String[] args) {
	LocalDate local=LocalDate.now();
	System.out.println(local);
	LocalTime time=LocalTime.now();
	System.out.println(time);
	LocalDateTime dateTime=LocalDateTime.now();
	System.out.println(dateTime);

}
}
