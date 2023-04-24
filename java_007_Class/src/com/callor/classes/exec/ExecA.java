
//java의 package
//java는 소스코드를 package단위로 관리환다
//package=folder와 같은 개념으로 보면 된다.
// base-package:com.callor.classes
//3단위, 3단계 package 단위를 base-package 라고 한다
// base-package 는 일부 Application ID(식별자) 역할을 한다.
//
package com.callor.classes.exec;

public class ExecA {
//정수 1개를 전달받아서 매개변수에 num1에 받고 num1변수에
//	전달받은 값이 소수인지 판별하여 소수이면 num1을
//	return하는 method정의
//	가장 기본적인 형태만 갖춘 method정의 
//	이걸 method의 원형, 프로토타입이라 한다.
	public static int prime(int num1) {
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				return 0;
			}
		}
		return num1;

	}

	public static void main(String[] args) {
//			prime()method에 정수 11을 전달해 소수인가 판별하고
//			그 결과를 console에 출력하기

		int result = prime(11);
		if (result > 0) {
			System.out.println(result + "는 소수");
		}

	}

}
