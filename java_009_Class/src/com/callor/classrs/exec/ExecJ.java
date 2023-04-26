package com.callor.classrs.exec;

public class ExecJ {

	// 매개변수 num변수로 전달받은 값이 prime 이면 num 을
	// 아니면 0을 return 하는 method 선언

	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;

	}

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		int fnum = 0;
		int findex = 0;

		int lnum = 0;
		int lindex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				fnum = nums[i];
				findex = i;
				
				break;				
			}

		}
		System.out.println("첫번째 프라임: " + fnum);
		System.out.println("첫번째 인덱스: " + findex);
		
		
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				lnum = nums[i];
				lindex = i;
			}
			
		}
		System.out.println("마지막 프라임: " + lnum);
		System.out.println("마지막 인덱스: " + lindex);
	}

}
//  배열 50개를 초기화 한 뒤 첫번째 for문에서 랜덤값을 각자 지정한 뒤에 변수를 지정한다. 첫번쨰 인덱스와 마지막 인덱스
//첫 프라임과 마지막 프라임 값을 지정할 변수 총 4개이다. for문을 2개 더 만드는데 첫번쨰 값들을 구할 for과 마지막 
//값들을 구할 for이다. 첫번째 값을 구할 for은 i가 0부터 배열 개수만큼 반복하는데 if 문을 (prime(nums[i])>0으로 놔서 
//인덱스와 소수값을 구한다. 그리고 브레이크를 걸면 for문을 한번만 실행하고 끝내기 때문에 첫번쨰 값들을 구할 수 있다.
// 출력은 브레이크 바로 직전에 한다. 세번째 for값에는 if문에 똑같이 대입을 하고 프라임 값을 저장할
// 변수=num[i]; 인덱스 값을 저장할 변수=i로 하면 마지막 값만 저장된다. 그리고 for문이 끝나고 출력한다 