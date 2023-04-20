package com.callor.controller;

public class ControllerH {

	/*
	 * prime() method의 코드를 수정하여 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type 의 prime() method를 boolean type 의 prime()method
	 * 
	 * method를 선언할 때 void type이외의 type으로 선언하면 method{}내에서 반드시 return을 적어야 한다.
	 * 
	 * prime()method{}내에서 선언했던 ran변수를
	 * 매개변수(parameter)로 변경하기
	 * 매개변수는 스스로 초기화 할수 없다.
	 * 누군가 prime() method를 호출하면서 값을
	 * 전잘해주어야만 그 값으로 초기화 할수 있다.
	 * prime(int ran=0) 과 같은 코드 사용불가
	 * 
	 * main()에서 prime(55)와 같은 코드가 실행될때 
	 * 매개변수 값이 초기화 된다.
	 * 
	 */

	public static boolean prime(int ran) {
		//int ran = (int) (Math.random() * 50) + 51;
		int i = 0;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				// break;
				return false;
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
			//main에서 랜덤수를 만들고
			int mainran = (int) (Math.random() * 50) + 51;
			//prime()method에게 '이미 계산된 값을'전달해주기
			//prime()method에게 mainRndNum변수에 저장된 값을 전달해주기
			// 이때 mainRndNum을 argument
			
			//prime 안에 수는 인수이자 argument
			if (prime(mainran)) {
				System.out.println("소수");
			} else {
				System.out.println("소수아님");
			}

		}

	}
}
