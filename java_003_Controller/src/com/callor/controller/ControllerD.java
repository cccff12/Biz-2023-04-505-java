package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {

		/*
		 * 1~100까지의 숫자를 가로방향으로 나열하기
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 */
		// i+1(1~100까지) 숫자를 일렬로 나열하기
		int last = 100;
		for (int i = 0; i < last; i++) {
			System.out.print((i + 1) + "\t");
			// 나열하다 출력할 숫자가 5의 배수이면 enter를 하여라
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

		for (int i = 0; i < last; i++) {
			// 여기서도 i에 1을 더하는 이유는 0부터 시작하지
			// 않게 하기 위해서다
			// 그리고 "\t"로 가로로 나열했다.
			System.out.print((i + 1) + "\t");
			// 여기서 5 단위마다 밑 줄로 내려야 한다.

			if ((i + 1) % 5 == 0) {
				System.out.println();
				// i에 1을 더한 이유는 0은 모든 숫자의 배수이기 때문에
				// 첫 줄에 빈칸이 생긴다. 그래서 i에 1을 더해 0없이
				// 1부터 시작한다.
				// 이렇게 해도 문제는 안생기는데 (i+1)이렇게 해도 5마다
				// 줄이 생기는 것은 변함이 없기 때문이다

			}
			// 그럼 왜 if가 가운데 들어가면 안되고 끝에 들어가야 하는가?
			// 그것은 if가 먼저 5단위로 필터링을 해서 나머지 숫자가 나올수
			// 없이 때문이다.

		}

	}
}
