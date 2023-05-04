package com.callor.scanner;

import java.util.Scanner;

public class ScannerB {

	private static int getNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수 입력 : ");
		System.out.print(" quit : 종료 ");
		String num = scan.nextLine();
		while (true) {

			try {

			} catch (Exception e) {
				num = Integer.valueOf(strNum);
			}
		}

	}

	public static int prime(int num) {
		int index = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		while (true) {
			int num = getNum();
			if (num < 0) {
				System.out.println("game over");
				return; // main() method에서 return 명령이 실행되면 프로젝트 코드 전체를 중단
			}
			/*prime ()method는 전달받은 num "변수의 값" 이 
			 * prime 이면 num을 return 아니면 -1 을 return 한다 return 한 결과를 다시 result 변수에 저장한다
			 */
			int result = prime(num);

			if (result > 0) {
				System.out.println(num + "은 소수다");
			} else {
				System.out.println(num + "은 소수가 아니다");
			}

		}

	}
}
