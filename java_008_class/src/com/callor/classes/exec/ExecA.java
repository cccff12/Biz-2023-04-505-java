package com.callor.classes.exec;

import com.callor.classes.module.ServiceA;

public class ExecA {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 50) + 51;
		int num2 = (int) (Math.random() * 50) + 51;
		int num3 = (int) (Math.random() * 50) + 51;
		int num4 = (int) (Math.random() * 50) + 51;
		int num5 = (int) (Math.random() * 50) + 51;
		int num6 = (int) (Math.random() * 50) + 51;
		int num7 = (int) (Math.random() * 50) + 51;

		ServiceA execa = new ServiceA();

		execa.score(num1, num2, num3, num4, num5, num6, num7);

	}
}
