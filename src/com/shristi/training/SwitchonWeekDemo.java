package com.shristi.training;

public class SwitchonWeekDemo {
	public static void main(String[] args) {

		String day = "TUesday";

		switch (day.toUpperCase()) {
		case "SUNDAY", "SATURDAY":
			System.out.println("Enjoying the Weekend");
			break;
		case "MONDAY":
			System.out.println("Gloomy days starting to work");
			break;
		case "TUESDAY", "WEDNESDAY", "THURSDAY":
			System.out.println("Busy with work");
			break;
		case "FRIDAY":
			System.out.println("Waiting the Weekend");
			break;

		default:
			System.out.println(" Wrong Day");
			break;
		}

	}

}
