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
	// java에서는 method의 이름을 매개변수의 type로 본다
	// prime(int ran)은 prime(int)라는 이름으로 선언되고
	// prime()은 prime()라는 이름으로 선언된다
	// 따라서 prime(int)와 prime()은 전혀 다른 method로 인식한다
	// 이것을 java의 특징중에 중복선언(over loading)이라고 한다

	// 호출하는 곳에서
	// prime(30)과 같이 호출하면 prime(int)가 실행되고
	// prime()과 같이 호출하면 prime()이 실행된다
	public static boolean prime() {
		int ran = (int) (Math.random() * 50) + 51;
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
