package com.shristi.training.array;

public class OneDimenstionArray {

	public static void main(String[] args) {

		int[] nums = { 10, 30, 90, 84, 74 };

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			sum += nums[i];
		}
		System.out.println(sum);

		// For each
		for (int val : nums) {

			sum += val;
		}

		System.out.println(sum);
	}

}
