package com.calloer.controller;

public class ControllerC {
	public static void main(String[] args) {
		/*
		 * 100개의 랜덤수를 생성하기
		 * 생성된 랜덤수가 3의 배수인가 판별
		 * 아니면 2의 배수인가 판별
		 */
		for (int i = 0; i < 100; i++) {
			int n1 = (int) ((Math.random() * 50) + 51);
			if (n1 % 3 == 0) {
				System.out.println(n1 + " 은 3의 배수");
			} else if (n1 % 2 == 0) {
				System.err.println(n1 + " 은 2의 배수");

			}

		}
	}
}
