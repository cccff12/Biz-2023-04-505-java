package com.calloer.controller;

public class ControllerB {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int n1 = (int) (Math.random() * 50) + 51;
			if (n1 % 2 == 0) {
				System.out.println(n1 + "짝수");
			}
			if (n1 % 2 == 1) {
				System.err.println(n1 + "홀수");
			}

		}

	}
}
