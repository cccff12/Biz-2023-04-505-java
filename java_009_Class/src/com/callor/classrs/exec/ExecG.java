package com.callor.classrs.exec;

public class ExecG {

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

		for (int i = 0; i < nums.length; i++) {
//prime method에게 nums 배열의 index번째 요소를 보내니 그 값이 prime인지 알려줘
			if (prime(nums[i]) > 0) {
				System.out.println(nums[i]);
			}

		}
//  소수인지 아닌지 구분하는 static int method를 만든다. 그리고 int 배열 50개를 만든후 첫번째 for에서 
//  각각 배열에 랜덤값을 구분한다. 그리고 두번째 for문에서는 index 가 nums.length(nums의 최댓값) 보다   
//  작을시 반복하게 한다. 이때 if문을 만드는데 조건에 위에서 만든 method를 넣는다. prime() 값 안에 
		//첫번째 for문에서 만든 nums.length 만큼의 랜덤수를 넣는다. 그렇게 된다면 랜덤수가 소수인지
		//위에서 만든 method가 소수인지 판단하게 된다. 그럼 소수가 아니라면 소수값을 리턴하게 되니 
		//if 조건을  0이상인 값으로 조건을 설정한다면 이 조건을 통과한 숫자만 if에 포함되게 하니 
		// 출력에 num[i]값을 넣으면 조건을 통과한 수만 출력하게 된다.
	
	}

}
