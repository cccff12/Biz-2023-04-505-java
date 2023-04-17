package com.callor.var;

public class VarB {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		//변수에 어떤 값을 저장, 할당, 대입하려면
		// 반드시 먼저 선언되어야 한다.
		
		//sum1 선언하고, 두 변수의 덧셈 결과 저장
		num1 = 30;
		num2 = 40;
		
		
		//sum1 선언과 동시에 두 변수의 덧셈 결과 저장
		//실수형 가능하지만 낭비다
		int sum1 = num1 + num2;
		
		/*
		 * num1 + num2 연산의 결과를 변수에 저장하려고 한다
		 * 이때 num1 과 num2 변수의 type 은 int type 이다
		 * 이 말은 num1과 num2 변수에 저장된 데이터는
		 * 당연히 int type이다 라는 것을 보증한다
		 * 결과적으로(int type ) + (int type) 연산이 되고
		 * 그 결과도 당연히 int type이 된다.
		 * 따라서 결과를 저장할 sum1 변수의 type도 당연히
		 * int type이 되어야 한다.
		 * 
		 * long형 또는 실수형 변수에 저장할수 있지만
		 * 여기에서는 메모리 낭비가 있을 것이다.
		 */
		
		
		System.out.println(sum1);

	}

}
