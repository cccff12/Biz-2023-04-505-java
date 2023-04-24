package com.callor.classes.exec;

public class ExecB {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
//		ExecA 클래스에 정의된 prime()method에게 rndNum변수의 값을 
//		전달하고 소수인가를 판별해 그 결과를 return받는다

//		prime ()method가 return 한 값을 result변수에 저장, 할당, 대입한다.
		int result = ExecA.prime(rndNum);
		if (result > 0) {
			System.out.println(result + "는 소수");
		} else {
			System.err.println(result + "는 소수 아님");
		}
	}
}