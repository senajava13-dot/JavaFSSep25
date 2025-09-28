package com.shristi.training;

public class ForLoopDemo {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " " + "x" + " " + i + "=" + n * i);
		}

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();

		}
	}

}
