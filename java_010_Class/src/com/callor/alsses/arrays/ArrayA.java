package com.callor.alsses.arrays;

public class ArrayA {

	public static void main(String[] args) {
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);

		}
		System.out.println();
//배열에 저장된 정수 값을 오름차순으로 정렬하기
		// 1. 먼저 전체 배열을 순회하는 for문을 만들고 현재
		// 2. 현재 index위치의 값과 index+1부터 끝까지와 비교한다
		// 3. 비교한 결과에서 큰 값을 오른쪽으로, 작은 값을 왼쪽으로 배열 요소의 값을 서로 교환한다
		// 4. 이 명령을 전체 배열 개수만큼 반복하면
		// 5. 배열에 저장된 값이 오름차순으로 정렬된다.

		// nums[0]과 nums[1] ~nums[4]까지 순서대로 비교
		// num[1]과 num[2],num[3],num[4]와 순서대로 비교
		// num[2]와num[3],num[4]를 차례로 비교
		// num[3]와num[4]를 비교
		// 하여 큰값은 오른쪽으로 작은 값은 왼쪽으로 계속해서 교환하기

		for (int out = 0; out < nums.length; out++) {
			for (int in = out + 1; in < nums.length; in++) {
				if (nums[out] > nums[in]) {
					int _tmp = nums[in];
					nums[in] = nums[out];
					nums[out] = _tmp;

				}

			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);

		}
		System.out.println();

		// %5d : 전체 5개의 자릿수를 확보하고 숫자를 오른쪽 정렬하는 문자열 생성

	}

}
