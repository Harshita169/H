package com.cts.training.date;

import java.util.Date;

public class DateAndTime {
public static void main(String[] args) {
	
	Date date=new Date();
	int day=date.getDay();
	System.out.println(date);//print system date
	switch(day)
	{
	case 0: System.out.println("Sunday");
	break;
	case 1: System.out.println("Monday");
	break;
	case 2: System.out.println("Tuesday");
	break;
	case 3: System.out.println("Wednesday");
	break;
	case 4: System.out.println("Thursday");
	break;
	case 5: System.out.println("Friday");
	break;
	case 6: System.out.println("Saturday");
	break;
	default:
		System.out.println("Wrong choice");
	}
}
}
