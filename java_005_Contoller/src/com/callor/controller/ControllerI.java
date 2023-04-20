package com.callor.controller;

public class ControllerI {

	public static boolean prime(int ran) {
		// int ran = (int) (Math.random() * 50) + 51;
		int i = 0;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				break;

			}
		}

		boolean yesPrime = ran <= i;
		return yesPrime;

	}

	public static boolean prime() {
		int ran = (int) (Math.random() * 50) + 51;
		return prime(ran);

	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			int mainran = (int) (Math.random() * 50) + 51;

			if (prime(mainran)) {
				System.out.println(mainran + "소수");
			}

			if (prime()) {
				System.out.println("소수");
			}

		}

	}
}
