package com.calloer.controller;

public class ControllerA {
	public static void main(String[] args) {

		int num2 = 100;

		for (int i = 0; i < num2; i++) {
			int num1 = (int) (Math.random() * 50) + 51;
			System.out.print(num1);
			if (num1 < 51 || num1 > 100) {
				System.err.println("over");
			} else {
				System.out.println("ok");
			}

		}

	}
}
