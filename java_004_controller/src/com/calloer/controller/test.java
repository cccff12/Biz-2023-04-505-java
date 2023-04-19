package com.calloer.controller;

/*
 * 짝수의 개수 합계 평균
 */
public class test {
	public static void main(String[] args) {

		int i3 = 0;
		int i4 = 0;

		for (int i = 0; i < 100; i++) {
			int i2 = (int) (Math.random() * 50) + 51;
			if (i2 % 2 == 0) {

				i3++;
				i4 += i3;

			}
			
		}
		int i5 = i4 / i3;
		System.out.printf("짝수의 개수 : %d \n", i3);
		System.out.printf("짝수의 합계 : %d \n", i4);
		System.out.printf("짝수의 평균: %d\n", i5);
	}

}
