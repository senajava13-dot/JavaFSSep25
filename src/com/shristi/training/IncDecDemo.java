package com.shristi.training;

public class IncDecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 1;
		int z = 5;

		int a = ++x + y++ + z;

		System.out.println(a + " " + x + " " + z + " " + y);

		int b = ++a + ++y + z--;
		System.out.println(b + " " + a + " " + x + " " + " " + y + " " + z);

		int c = a + b++ + x + y++;
		System.out.println(c + " " + b + " " + a + " " + x + " " + " " + y + " " + z);

	}

}
