package com.qa.switchCases;

public class Days {
	public static String daysOfWeek(String today) {

		switch (today) {

		case "monday":
			System.out.println("monday sucks");
			break;
		case "tuesday":
			System.out.println("tuesday is meh");
			break;
		case "wednesday":
			System.out.println("wednesday - half way");
			break;
		case "thursday":
			System.out.println("thursday - are ok");
			break;
		case "friday":
			System.out.println("friday - are cool");
			break;
		case "saturday":
			System.out.println("saturday - are the best");
			break;
		case "sunday":
			System.out.println("sunday - are relax");
		}

		return null;

	}
}