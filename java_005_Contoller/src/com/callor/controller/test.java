package com.callor.controller;

public class test {
	public static void main(String[] args) {

		for (int index = 0; index < 100; index++) {
			int i = 0;
			int r = (int) (Math.random() * 50) + 51;
			for (i = 2; i < r; i++) {
				if (r % i == 0) {
					break;
				}

			}
			if (r <= i) {
				System.out.printf("%d는 소수다\n", r);
			} else {
				System.out.printf("%d는 소수가 아니다\n", r);
			}

		}
	}
}
