package com.callor.system.exec;

import java.util.Scanner;

public class ScannerE {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			String strNum1 = "";
			String strNum2 = "";
			while (true) {
				System.out.println(" 두 개의 정수를 입력하세요");
				System.out.println("정수 1(quie: 종료)>>");
				strNum1 = scan.nextLine();
				if (strNum1.equals("quie")) {
					break;
				}
				try {
					num1 = Integer.valueOf(strNum1);
				} catch (Exception e) {
					System.out.println("1은 정수값만 입력해야 해요 ㅠ\n");
					continue;
				}
				break;
			}
			if (strNum1.equals("QUIT")) {
				break;
			}

			while (true) {
				System.out.printf("정수2(quie: 종료)>>");
				strNum2 = scan.nextLine();
				if (strNum2.equals("quie")) {
					break;
				}
				try {
					num2 = Integer.valueOf(strNum2);
				} catch (Exception e) {
					System.out.println("2는 정수값만 입력해야 해요 ㅠ\n");
					continue;
				}

				System.out.println(num1 + num2);
				System.out.println(num1 - num2);
				System.out.println(num1 * num2);
				System.out.println(num1 / num2);
				System.out.println(num1 % num2);
			}
			System.out.println("GAME OVER");
		}
	}

}
