package com.callor.classrs.exec;

public class ExecE {
	public static void main(String[] args) {
		//배열 요소의 생성 개수는 그때 그떄 상황에 따라 다르다
		// 배열의 요소를 대상으로 for() 반복문으로 처리를 할때 
		// 배열 요소의 개수를 일일히 숫자로 코딩하는 것은
		//배열 요소의 개수가 변경 될때마다 수정해야하는 코드 부분이 많아진다
		
		//그래서 자바에서는 java에서는 배열을 생성하면 배열의 요소 개수를
		//알수 있는 변수를 자동으로 생성한다.
		
		//그 이름은 "배열이름.length"(배열의 최대 값)
		
		
		int[] nums = new int[10];
		//데이터 준비, 데이터 수집
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;

		}
//데이터 처리 5의 배수 찾기
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println(nums[i]);
			}

		}

	}
}
