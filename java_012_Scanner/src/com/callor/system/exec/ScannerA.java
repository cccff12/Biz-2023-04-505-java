package com.callor.system.exec;

import java.util.Scanner;

public class ScannerA {
	public static void main(String[] args) {
		// 키보드에서 데이터를 입력 받아 사용
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		// while(조건) 명령문
		// 조건의 결과가 true인 동안 무한히 반복하는 명령문
		while (true) {

			// prompt (안내문) 먼저 보여주기
			System.out.println("두 정보 입력");

			System.out.println("정수 1>>");
			num1 = scan.nextInt();

			System.out.println("정수 2>>");
			num2 = scan.nextInt();

			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

		}

	}
}
