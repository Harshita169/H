package com.cts.training.date;

import java.time.Clock;

public class DateNine {
public static void main(String[] args) {
	Clock clock=Clock.systemUTC();
	System.out.println("clock:"+clock);
	Clock defaultzone=Clock.systemDefaultZone();
	System.out.println("default zone of clock:"+defaultzone);
}
}
