package com.callor.classes.arrays;

public class ArrayF {

	public static int prime(int ran) {

		int i;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				return 0;
			}

		}
		return ran;

	}

	public static void main(String[] args) {

		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			if(prime(num[i])>0) {
				System.out.println(num[i]+"소수");
			}else {System.out.println(num[i]+"소수아님");
				
			}
		}
	}

}
