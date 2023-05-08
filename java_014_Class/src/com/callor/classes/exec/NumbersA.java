package com.callor.classes.exec;

public class NumbersA {
	public static void main(String[] args) {
//		 기본자료형(Primitive type) 변수 생성 키워드
//		값을 저장하는 용도만 사용하는 키워드
		int num1 = 0;
		float num2 = 0.0f;
		long num3 = 0L;
		double num4 = 0.0;
		boolean bYes = true;
		char cVar='A';
		
		
//		참조자료형 (class type) 변수 생성 키워드
//		기본자료형 변수에 특별한 기능을 부가하여 
//		여러 용도로 사용하기 
//		위한 키워드
//		기본변수와 성질이 유사한 클래스들
//		Wrapper class :
//		기본 변수 성질을 가지만서, 확장된 기능을 갖도록 하는 클래스
		
		
		Integer intNum1 = 0;
		Float flaotNum2 = 0.0f;
		Long longNum3 = 0L;
		Double douNum4 = 0.0;
		Boolean bYes1 = true;
		String str = " Republic of Korea";
		Character cVar1='A';
		
//		기본적으로 데이터를 저장하는 변수의 성질을 갖는다
//		int형 정수와 Integer 형 정수는 기본 정수값을 저장하는
//		변수의 성질을 갖는다
		
		num1 = intNum1; //Integer type의 데이터를 int type의 변수에 저장
		intNum1=num1;// int type 의 데이터를  Integer type의 변수에 저장
		
		
		/*
		 * 기본형 변수에 저장된 데이터를 참조형 변수에 저장하는 순간
		 * 확장된 기능을 사용할수 있다.
		 * 기본형 변수에 저장된 데이터를 참조형 변수에 저장하는 것
		 * box에 기본형 변수를 담는 것과 유사해서 boxing이라고 한다.
		 * 
		 * wrapper클래스에 저장된 데이터를 기본형 변수에 저장하는 것을
		 * unboxing 이라고 한다.
		 * 
		 * 
		 */
		
		
	}
}
