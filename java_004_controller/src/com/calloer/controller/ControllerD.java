package com.calloer.controller;

public class ControllerD {
	// 51~100 까지 랜덤수 100개 생성
	// 생성된 랜덤수 중에 짝수가 몇 개인가 판별

	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		float count2 = 0f;
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 50) + 51;
		
			if (num % 2 == 0) {
				count1+=num;
				count++;
				
			}

		}
		System.out.printf("짝수의 개수: %d\n", count);
		System.out.printf("짝수의 합계%d\n", count1);
		System.out.printf("짝수의 평균%f\n", count2);
	}
}
