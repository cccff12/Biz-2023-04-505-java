package com.callor.alsses.arrays;

public class ArrayB {
	public static void main(String[] args) {

		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);

		}
		System.out.println();
		
		
		
		
		/*
		 *  배열 index 범위에서 임의 랜ㄷ머수 2개를 생성하고 랜덤수 위치의 값을
		 *  서로 바꾸는 연산을 100번 수행. 배열에 담긴 수가 규칙없이 섞이는 shuffle코드가 된다.
		 */
		
		for (int i = 0; i < 100; i++) {

			// nums배열의 index 범위 (0~4) 에서 랜덤수 생성하기
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			int _tmp=nums[index1];
			nums[index1]=nums[index2];
			nums[index2]=_tmp;
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);
		
	}

}}
