package com.callor.system.exec;

import java.util.Scanner;

public class ScannerC {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println(" 두 개의 정수를 입력하세요");
			System.out.println("정수 1(quie: 종료)>>");
			String strNum1 = scan.nextLine();
			num1 = Integer.valueOf(strNum1);
			System.out.printf("정수2(quie: 종료)>>");
			String strNum2 = scan.nextLine();

			if (strNum1.equals("quie")) {
				break;
			}
			
			num2 = Integer.valueOf(strNum2);
			System.out.println(strNum1 + strNum2);
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			
		}
		System.out.println("끝");

	}
}
