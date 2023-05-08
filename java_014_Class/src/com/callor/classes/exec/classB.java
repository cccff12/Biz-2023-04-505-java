package com.callor.classes.exec;

public class classB {
	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int u = i + 1; u < nums.length; u++) {
				if (nums[i] > nums[u]) {
					int num = nums[i];
					nums[i] = nums[u];
					nums[u] = num;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);

		}

	}
}
