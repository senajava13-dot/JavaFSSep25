package com.shristi.training;

public class IfElseDemo {

	public static void main(String[] args) {
// find  greatest number from given 3 numbers
		int num1 = 100;
		int num2 = 140;
		int num3 = 130;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Greatest Number is: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Greatest Number is: " + num2);
		} else {
			System.out.println("Greatest Number is: " + num3);
		}

		String name = "Shri";
		if (name.equals("Shri")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Wrong User");
		}

	}

}
