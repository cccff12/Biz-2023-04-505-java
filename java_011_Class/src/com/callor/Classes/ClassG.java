package com.callor.Classes;

import java.util.Scanner;

public class ClassG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		/*
		 * 무한 반복 loop while(반복조건){ } 반복조건이 true 인 동안 무한 반복
		 * 
		 * while (true){ } 조건이 무조건 true이므로 계에속 반복한다. 코드를 강제로 멈추지 않으면 영원히 반복된다.
		 * 
		 */

		while (true) {

			System.out.println("두 개의 정수를 입력하세요");
			System.out.println("-1 이면 중단");
			System.out.print("정수 1 : ");

			num1 = scan.nextInt();

			// while(true) 무한 반복 종료 조건 설정
			if (num1 < 0) {
				break;
			}
			System.out.print("정수 2 : ");

			num2 = scan.nextInt();
			if(num2<0) {
				break;
			}
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

		}
		System.out.println("game over");

		scan.close();

	}
}
