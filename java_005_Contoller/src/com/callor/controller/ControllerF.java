package com.callor.controller;

public class ControllerF {

	/*
	 * prime() method의 코드를 수정하여 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type 의 prime() method를 boolean type 의 prime()method
	 * 
	 * method를 선언할 때 void type이외의 type으로 선언하면 method{}내에서 반드시 return을 적어야 한다.
	 */

	public static boolean prime() {
		int ran = (int) (Math.random() * 50) + 51;
		int i = 0;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				break;
			}
		}

		boolean yesPrime = ran <= i;
		return yesPrime;

		/*
		 * if (ran <= i) { // System.out.println(ran + "는 소수"); }else { //
		 * System.err.println(ran+"는 소수 아님"); }
		 * 
		 */

	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime () method의 {}내의 코드를 실행해달라
			// prime () method를 호출한다 라고 표현
			if (prime()) {
				System.out.println("소수");
			} else {
				System.out.println("소수아님");
			}

		}

	}
}
