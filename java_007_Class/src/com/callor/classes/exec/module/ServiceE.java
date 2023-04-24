package com.callor.classes.exec.module;

public class ServiceE {
	public void score(int kor, int eng, int math) {
		int sum = kor + eng + math;
		float avg = sum / 3f;

		System.out.printf("국어:%d 영어:%d 수학:%d, 총점%d 평균%f",
				kor, eng, math, sum, avg);

	}
}
