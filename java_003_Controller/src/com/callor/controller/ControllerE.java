package com.callor.controller;

public class ControllerE {
	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			int intScore = (int) (Math.random() * 50) + 51;
			// if (intScore < 51 || intScore > 100) {
			if (!(intScore >= 51 && intScore <= 100)) {
				System.out.println(intScore);
			}

		}
		//다음 예제에서 num2의 최종값을 확인하고
		//왜 그렇게 값이 나오는지 설명
		System.out.println("Test End");
		int num1 = 100;
		int num2 = 100;
		if (++num1 > 100 || ++num2 > 100) {
			System.out.println("ok");
		}
		if (--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
		}

	}

}
