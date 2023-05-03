package com.callor.system.exec;

public class StringA {

	public static void main(String[] args) {

		// 문자열 변수
		/*
		 * 일반적인 변수(primitive variable) : int float long boolean char primitive 변수는 변수를
		 * 선언하는 키워드가 모두 소문자이다. 이 키워드는 단지 데이터를 저장하는 공간인 변수를 선언하는 용도이다. 변수의 타입을 강제 변환하는
		 * 용도로만 사용한다. ex) -(int)
		 * 
		 * 문자열 변수는 primitive type이 아니라 클래스 타입이다. 프리미티브는 위의 두 가지 뿐이지만 class type으로 생선된
		 * 변수는 method같은 기능을 포함한다.
		 * 
		 * 
		 */
		String str1 = "korea";
		System.out.println(str1.substring(3));

		// String class type의 변수 생성하기
		String str2 = "korea";// 첫번째 일반적인 방법

		String str3 = new String("korea");// 두번째 (객체방식 방법)

		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);

		boolean bYes = str2 == str3;
		
		System.out.println(bYes);
		
		
	}

}
