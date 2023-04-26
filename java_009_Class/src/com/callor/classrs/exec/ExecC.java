package com.callor.classrs.exec;

public class ExecC {

	public static void main(String[] args) {

		int[] nums = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {

			nums[i] = (int) (Math.random() * 50) + 51;

		}

		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
}