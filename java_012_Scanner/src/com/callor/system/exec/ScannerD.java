package com.callor.system.exec;

import java.util.Scanner;

public class ScannerD {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println(" 두 개의 정수를 입력하세요");
			System.out.println("정수 1(quie: 종료)>>");
			String strNum1 = scan.nextLine();
			if (strNum1.equals("qq")) {
				break;
			}
			
			try {
				num1 = Integer.valueOf(strNum1);	
			} catch (Exception e) {
				
				/*
				 * try-catch 블럭에서 exception 이 발생한 경우
				 * integer.value()명령이 실행되는 도중
				 * 정상적으로 작동되지 않았을 때
				 * catch{}내의 코드가 실행된다.
				 * try-catch 블럭으로 감싼 코드는 exception이 발생해도 
				 * 중단을 방지한다.
				 */
				// TODO: handle exception
			System.out.println("정수값만 입력해야 해요 ㅠ\n");
			continue;
			}
			
			System.out.printf("정수2(quie: 종료)>>");
			String strNum2 = scan.nextLine();
			num2 = Integer.valueOf(strNum2);
			System.out.println(strNum1 + strNum2);
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			
		}
		System.out.println("끝");

	}
}
