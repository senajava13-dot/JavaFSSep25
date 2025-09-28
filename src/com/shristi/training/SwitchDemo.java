package com.shristi.training;

public class SwitchDemo {

	public static void main(String[] args) {
		String choice = "read";
		switch (choice.toUpperCase()) {
		case "READ":
			System.out.println("Reading File");
			break;
		case "WRITE":
			System.out.println("Writing File");
			break;
		case "EXECUTE":
			System.out.println("executing File");
			break;

		default:
			System.out.println("Wrong Choice");
			break;
		}
	}

}
