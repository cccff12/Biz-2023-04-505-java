package com.callor.controller;

public class ControllerA {

	/*
	 * java.exe.도구가 ControllerA.class파일을 읽어서 메모리에 load하고 제일 먼저 호출하는 method() 시작점
	 * 매서드, 진입점 메서드
	 */

	public static void main(String[] args) {
		
		//return type이 void이르모 
		prime();
		// prime()method는 return type이 void이기 떄문에 다른 명령문에
		// 포함되거나 변수의 값을 생성할수 없다

		//if (prime());
		//변수에 대입하는 값도 생성할수 없다
		//boolean yesPrime=prime();
			
		
		
	}// end main

	/*
	 * 매개변수도 없고, return type이 void(없다는 뜻)인 prime()method 선언
	 */

	public static void prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		if (index >= rndNum) {
			System.out.println(rndNum + "는 소수");
		} else {
			System.out.println(rndNum + "는 소수가 아님");
		}

	}

}
