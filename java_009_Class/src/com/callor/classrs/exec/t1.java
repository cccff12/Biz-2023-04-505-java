package com.callor.classrs.exec;

public class t1 {
	public static void main(String[] args) {
		//배열 생성(선언과 초기화가 된 상태)
		int[] num = new int[10];
//생성된 배열 요소에 값 채워넣기
		//데이터 수집
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
		//생성된 배열요소에 채워진 값들의 전체를 합산
		//데이터 처리
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += num[i];

		}
		System.out.println(sum);
	}
}
