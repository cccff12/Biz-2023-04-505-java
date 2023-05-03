package com.callor.Classes;

import java.util.Scanner;

public class ClassH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		while (true) {
			System.out.println("두 정수 입력, 단 임의의 값 입력시 반복문 중단");

			System.out.print("정수 1 입력 : ");
			num1 = scan.nextInt();

			System.out.print("정수 2 입력 : ");

			num2 = scan.nextInt();
			if (num1 < 0) {
				System.out.printf("덧셈: %d + %d =%d\n", num1, num2, num1 + num2);
				System.out.printf("뺄셈: %d - %d =%d\n", num1, num2, num1 - num2);
				System.out.printf("곱셈: %d * %d =%d\n", num1, num2, num1 * num2);
				System.out.printf("나눗셈: %d / %d =%d\n\n", num1, num2, num1 / num2);

				continue;
			}

			if (num2 < 0) {
				System.out.printf("덧셈: %d + %d =%d\n", num1, num2, num1 + num2);
				System.out.printf("뺄셈: %d - %d =%d\n", num1, num2, num1 - num2);
				System.out.printf("곱셈: %d * %d =%d\n", num1, num2, num1 * num2);
				System.out.printf("나눗셈: %d / %d =%d\n\n", num1, num2, num1 / num2);
				continue;
			}

			System.out.printf("덧셈: %d + %d =%d\n", num1, num2, num1 + num2);
			System.out.printf("뺄셈: %d - %d =%d\n", num1, num2, num1 - num2);
			System.out.printf("곱셈: %d * %d =%d\n", num1, num2, num1 * num2);
			System.out.printf("나눗셈: %d / %d =%d\n\n", num1, num2, num1 / num2);

		}
	}

}
