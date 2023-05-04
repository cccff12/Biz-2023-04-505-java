package com.callor.scanner;

import java.util.Scanner;

public class ScannerA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수 입력 : ");
		int num1 =0;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				num1=scan.nextInt();
		int num2 = num1;

		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				num1 = 0;
				break;
			}
		}
		
		if (num1 > 0) {
			System.out.println(num2 + "은 소수다");
		} else {
			System.out.println(num2 + "은 소수가 아니다");
		}
		scan.close();

	}
}
