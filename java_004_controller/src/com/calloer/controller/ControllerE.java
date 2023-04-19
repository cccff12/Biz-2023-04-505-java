package com.calloer.controller;

public class ControllerE {
	public static void main(String[] args) {
		/*
		 * 51~100까지 랜덤수 1개를 만들고 이 수가 소수가 아닌지 찾기
		 * 
		 *
		 */

		int n1 = (int) (Math.random() * 50) + 51;
		// 이 for 명령에 의해 index값은 2부터 n1값은 
		// 2부터 i2-1까지 연속된 정수로 만들어져 
		// for (){}에서 사용 가능 
		for (int i = 2; i < 100; i++) {
			if (n1 % 2 == 0) {
				System.out.println(n1+":");
				System.out.println(i+"로 나누면 나머지");
				System.out.println(n1%i);
				System.out.println("이 수는 소수가 아님");
			//반복문을 수행하여 연산을 실행하는 과정에서
				//소수가 아님을 판별하면 더이상 반복문을
				//진행할 필요가 없으니 여기서 중단
				// break: for()반복문을 중단할때
			break;
			
			}
		}
	}
}
