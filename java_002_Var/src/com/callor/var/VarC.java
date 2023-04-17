package com.callor.var;

public class VarC {
	public static void main(String[] args) {

		// 선언되지 않은 변수는 절대 사용할 수 없다.
		// 값을 저장하기 위해서 변수는 최소한 선언은 되어 있어야 한다
		int num1;
		int num2;

		num1 = 30;
		num2 = 40;

		// 선언만 되어있는 변수는 절대 읽을 수 없다.
		// 변수값을 읽으려면 반드시 초기화(값을 할당하는 것) 필요
		// 변수에 할당할 값이 정해지지 않았으면 0이라도 할당해야 한다.
		// 여기서 0을 할당 하는 것을 clear라고 한다.
		int sum1 = 0;
		System.out.println(sum1);

		
		
		
		
		
		
		
		
	}
}
