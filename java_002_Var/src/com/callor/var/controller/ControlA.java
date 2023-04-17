package com.callor.var.controller;

public class ControlA {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 43;

		boolean bEven1 = num1 % 2 == 0;
		boolean bEven2 = num2 % 2 == 0;

		/*
		 * if (조건연산식){ } 만약 "조건 연산식"의 결과가 true면 { } block 내부의 코드를 실행하라
		 * 
		 * if (boolean type 변수) { } 만약 " boolean type 변수" 값이 true 면 { } block 내부의 코드를
		 * 실행하라
		 */

		// bEven1 변수의 값이 true 면
		if (bEven1) {
			System.out.println(num1 + "는 짝수야!!!");
		}

		if (!bEven2) {
			System.out.println(num2 + "는 짝수야!!!");
		}
		
		// bEven2 값이 true 가 아니면
		if (!bEven2) {
			System.out.println(num2 + "는 짝수가 아니다");
		}
		
		/*
		 * control keyWord
		 * 어떤 조건에 따라서 명량 실행 순서를 변경하는 명령문
		 * if () 명령문은 () 의 조건이 true, false에 따라
		 * 코드의 실행순서를 변경한다.
		 * 
		 * if () 명령문에서 
		 * () 조건이 true 일때는 ~~ 한다. 라고 읽는다.
		 * () 조건이 !true 일때는 ~~가 아니다. 라고 읽는다.
		 * () 조건이 false 일때는 ~~가 아니다. 라고 읽는다.
		 * 
		 */
		
		
	}
}
