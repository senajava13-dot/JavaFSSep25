package com.shristi.training.array;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
				sum += a[i][j];
			}
			System.out.println();

		}
		System.out.println(sum);
		for (int[] onedim : a) {
			for (int val : onedim) {
				System.out.print(Math.pow(val, 2)+" ");
			}
			System.out.println();
		}
		
	}

}
