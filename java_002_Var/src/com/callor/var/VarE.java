package com.callor.var;

public class VarE {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		num1 = 30;
		num2 = 40;

		int plus1 = num1 + num2;
		int minus1 = num1 - num2;
		int time1 = num1 * num2;
		int devide1 = num1 / num2;

		System.out.println(plus1);
		System.out.println(minus1);
		System.out.println(time1);
		System.out.println(devide1);

		System.out.printf("%d + %d = %d\n" , num1, num2, plus1);
		System.out.printf("%d - %d = %d\n" , num1, num2, minus1);
		System.out.printf("%d * %d = %d\n" , num1, num2, time1);
		System.out.printf("%d / %d = %d\n" , num1, num2, devide1);
	}
}
