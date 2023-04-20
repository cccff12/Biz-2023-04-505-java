package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {

		for (int index = 0; index < 100; index++) {
			int ran = (int) (Math.random() * 50) + 51;
			int i = 0;
			for (i = 2; i < ran; i++) {
				if (ran % i == 0) {
					break;
				}
			}
			if (i >= ran) {
				System.out.printf("%d은 소수이다\n", ran);
			} else {
				System.out.printf("%d은 소수가 아니다\n", ran);
			}

		}
	}
}