package com.callor.controller.var;

public class VarA {
	public static void main(String[] args) {
		int intKor = 100;
		int intEng = 95;
		int intMath = 98;
		int Total = intKor + intEng + intMath;
		// 위에 변수를 구했으니 그 변수를 적어도 됐다.
		// 소수점이하 평균 오차를 찾기 위해 정수를
		// 실수로 강제 형변화하여 연상으 ㄹ수행
		float floatAvg = (float)Total / 3;
		System.out.println("===================");

		System.out.println("국어:" + intKor);
		System.out.println("영어:" + intEng);
		System.out.println("국어:" + intMath);

		System.out.println("-------------------");
		System.out.printf("총점:%d, 평균:%5.2f", Total, floatAvg);

	}
}
