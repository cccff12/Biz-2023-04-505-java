package com.callor.classes.exec;

import com.callor.classes.exec.module.MyClassC;

public class ExecH {

	/*
	 * 51~100중의 랜덤수를 생성하여 MyClassC의 prime ()method에게 전달하고 소수인지 아닌지 결과를 console에 출력
	 */

	public static void main(String[] args) {

		int math = (int) (Math.random() * 50) + 51;
//MyClassC type의 myC객체 생성
//		MyCsms myClassC의 대리자 역할을 수행할 것이다.
		MyClassC myC = new MyClassC();
//		myC대리자를 통해 prime(int)method를 호출하고 결과를 result 변수에 담아도 된다.
//		result 에 저장된 값이 0이면 소수아니고 0보다 크면 소수임
		if (myC.prime(math) == 0) {
			System.out.println(math+"소수가 아니다");
		} else {
			System.out.println(math+"소수이다");
		}
	}

}
