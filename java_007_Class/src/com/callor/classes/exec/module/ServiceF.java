package com.callor.classes.exec.module;

public class ServiceF {
	public void score(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		float avg = sum / 7f;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
}