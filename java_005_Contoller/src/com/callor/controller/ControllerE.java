package com.callor.controller;

public class ControllerE {

	
	
	/*
	 * method의 선언
	 * method는 마치 java의 명령문을 새로 만드는 것과 같다
	 * method 선언 규칙에 따라 이름() {}을 만들고
	 * {}내에 원하는 규칙을 만든다
	 */
	public static void prime() {
		int ran = (int) (Math.random() * 50) + 51;
		int i = 0;
		for (i = 0; i < ran; i++) {
			if (ran % i == 0) {
				break;
			}
		}
		if (ran <= i) {
			System.out.println(ran + "는 소수");
		}
		
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime () method의 {}내의 코드를 실행해달라
			// prime () method를 호출한다 라고 표현
			prime();
			
		}

	}
}
