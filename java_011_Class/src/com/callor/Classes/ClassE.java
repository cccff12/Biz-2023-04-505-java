package com.callor.Classes;

import java.util.Scanner;

public class ClassE {
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 :");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 :\n");
		int num2 = scan.nextInt();

		System.out.print("덧셈");
		System.out.printf("%d+%d=%d \n", num1, num2, num1 + num2);
		System.out.print("뺄셈");
		System.out.printf("%d-%d=%d \n", num1, num2, num1 - num2);
		System.out.print("곱셈");
		System.out.printf("%d*%d=%d \n", num1, num2, num1 * num2);
		System.out.print("나눗셈");
		System.out.printf("%d/%d=%d \n", num1, num2, num1 / num2);
	}
}
