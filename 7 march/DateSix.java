package com.cts.training.date;

import java.time.LocalTime;

public class DateSix {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		LocalTime newTime=time.plusHours(3);
		System.out.println("After adding hours in time: "+newTime);
	}

}
