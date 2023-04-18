package com.callor.controller;

public class ControllerF {
	public static void main(String[] args) {
		// 이중 for문은 안쪽의 코드가 여기서는 100번 실행된다.
		// 여기서 상위 for문이 1번 실행될때 하위 for문은 10번 실행된다.
		int last = 10;
		for (int i = 0; i < last; i++) {
			for (int j = 0; j < last; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=".repeat(20));
		//바깥의 i 변수는 내부의 for변수에 영향을 미칠수 있다.
		for (int i = 0; i < last; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
