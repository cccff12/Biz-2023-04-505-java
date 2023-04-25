package com.callor.classes.arrays;

/*
 * 정수형 배열 10개를 nums이름으로 선언하고
 *  각 요소에 50~100까지 랜덤수를 저장하고 
 * 배열요서에 저장된 값들을 덧셈하여 출력
 */
public class ArrayD {
	public static void main(String[] args) {
		int[] nums = new int[10];

		nums[0] = (int) (Math.random() * 50) + 51;

		// for()반복문을 사용하여 nums배열의 각요소값을 램덤수로 채워넣기
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;

		}
		for (int i = 0; i < 10; i++) {
			System.out.println(nums[i] + "\t");
		}
		// 각 요소에 저장된 정수를 모두 더하여 결과 표시
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.println(sum);

	}
}
