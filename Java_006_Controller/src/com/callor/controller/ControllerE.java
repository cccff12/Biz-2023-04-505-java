package com.callor.controller;

public class ControllerE {
	/*
	 * 2개의 정수형 인수를 전달받아 덧셈을 수행한 후 method선언을 할때 정수형 정수형 매개변수 2개가 필요하다 덧셈을 수행한 후 결과는
	 * int형이다.
	 * 
	 * 
	 * 결과를 return하는 method method의 return type가 int
	 * 
	 */
	public static int add(int num1, int num2) {

		// 두 변수에 저장된 값을 덧셈하고 그 결과를 리턴함
		// add() method입장에서 보면 num1과num2에는 어떤 정수박이
		// 저장되어 있을 것이라 라는 믿음
		return num1 + num2;

	}// 메서드 끝

	public static int abc(double abc, int ha, int abcd, float abcde) {
		int iinb = (int) abc;
		int da = iinb + ha;
		int al = (int) abcde;
		int alzahad = (int) abcde;

		int alz = iinb + da + al + alzahad;

		return alz;
	}

	public static void main(String[] args) {
		//1. add() method호출
		//2. add() method는 2개의 정수형 매개변수를 가지고 있다
		//정수값 2개를 "전달"해 주어야 한다.
		//3. add()method실행한 후 결과값을 return한다
		//4. add() method가 return 한 값을 다른 변수에 저장
		//5. 이때 add()method실행결과를 다른 변수에 저장 할려면
		//그 변수의 타입이 add()method의 return과 같아야 한다.
		//그래서 int result형식으로 변수를 선언한다.
		// 6. main에서 선언하고 add)method메서드를 담은 
		//변수에는 add()method의 실행결과가 담긴다
		
		
		int num1 = add(15616546, 200000000);
		System.out.println(num1);

		int num2 = abc(1, 2, 3, 4);
		System.out.println(num2);

	}// 메인 끝

}
