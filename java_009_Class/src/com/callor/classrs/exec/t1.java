package com.callor.classrs.exec;

public class t1 {
	public static void main(String[] args) {
		
		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
		
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += num[i];

		}
		System.out.println(sum);
	}
}
