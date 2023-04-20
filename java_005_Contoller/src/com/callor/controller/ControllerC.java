package com.callor.controller;

public class ControllerC {
	public static void main(String[] args) {
		int r = (int) (Math.random() * 50) + 51;
		int i;
		for (i = 2; i < r; i++) {
			if (r % i == 0) {
				// System.out.println(r+"소수아님");
				break;
			}
		}
		System.out.printf("r %d, i %d\n", r, i);
		// for ()반복문에서 최대값 index의 관계
		// 최대값표현 index<최대값 또는 index<=최대값으로
		// 표현을 한다
		// for() 반복문이 몇번 반복될 것인가를 결정짓는 연산식이다.
		// for()반복문은 중간에 break를 만나서 반복문 실행을 중단할수 있다. 또는
		// 그렇지 않고 모든 조건대로 반복문이 실행 완료될수 있다.
		// for()반복문이 실행완료되면 r<=i조건이 true가 된다.
		// 이 조건을 검사하려면 i 변수를 for()이전에 선언
		//

		if (r <= i) {
			System.out.printf(r + "소수");
		} else {
			System.out.printf(r + "소수아님");
		}

	}
}
