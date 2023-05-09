package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;

public class ExecB {

	public static void main(String[] args) {
		
//		StudentDto클래스를 사용해 stDto객체변수 생성하기
		StudentDto stDto= new StudentDto();
//	stDto 라는 객체의 Dot(.) 연산자를 사용해 stNum 변수에 접근하여
//		0001이라는 문자열을 "저장하기"
	stDto.stNum="0001";
	
//	stDto 객체에 Dot(.) 연산자를 사용하여 stNum변수에 접근하여
//	값을 읽고 stNum 변수에 값을 복사하기
	String stNum= stDto.stNum;
	
	
//	stDto 객체에 Dot연산자를 사용해 stNum 변수에 접근해 값을 읽고 콘솔에 출력
	System.out.println(stDto.stNum);
	
	
//	studentDto클래스를 사용하여 생성한 홍길동, 이몽룡, 성춘향 객체변수는
//	서로간에 데이터 간섭이 없는 독립된 변수이다
//* 3개의 객체변수를 생성 후 홍길동 객체의 사용법이다.	 
	StudentDto 홍길동= new StudentDto();
	 홍길동.stName= " 홍길동";
	 StudentDto 이몽룡= new StudentDto();
	 StudentDto 성춘향= new StudentDto();
	
	
	}
	
}
