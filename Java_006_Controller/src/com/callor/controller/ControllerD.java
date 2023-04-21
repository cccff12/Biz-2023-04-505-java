package com.callor.controller;

public class ControllerD {

	public static int prime() {

		int rndnum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndnum; i++) {
			if (rndnum % i == 0) {
				return 0;
			}
		}
		return rndnum;

	}

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 100; i++) {
			int rndnum = prime();	
			if (rndnum > 0) {
				count++;
				sum += rndnum;
			}

		}
		
	
		System.out.printf("%d 는 소수의 개수\n", count);
		System.out.printf("%d 는 소수의 합\n", sum);
	}

}


