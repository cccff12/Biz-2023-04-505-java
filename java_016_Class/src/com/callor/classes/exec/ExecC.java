package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StudentDto;

public class ExecC {
	public static void main(String[] args) {
//	StudentDto type List 객체변수 stdList 생성하기
//	현재는 size() 가 0인 변수
		List<StudentDto> stdList = new ArrayList<>();
//	 홍길동의 학생정보를 저장하기 위환 stDto 를 생성하고, 새로운 저장공간 생성
		StudentDto stDto = new StudentDto();

//	학번, 이름, 학과 변수에 값을 저장하고, 그 공간에 저장
//	0번째 데이타
		stDto.stNum = "0001";
		stDto.stName = "홍길동";
		stDto.stDep = "정보통신";
//  홍길동 객체를 stdList에 추가하기	
		stdList.add(stDto);

//	stDto를 새롭게 만듬, 위의 홍길동과 전혀 다른 전혀 다른 독립적인 데이터
//		앞에 클래스가 없는 건 새로 생성이 아니라 갱신으로 볼 수 있을것
//	1번쨰 데이터
		stDto = new StudentDto();
		stDto.stNum = "0002";
		stDto.stName = "성춘향";
		stDto.stDep = "컴퓨터 공학";
		stdList.add(stDto);

//	0번쨰 객체의 stName을 출력해 달라
		System.out.println(stdList.get(0).stName);

//	stdList 의 index 0데이터 (학생객체 데이터) 를 
//	get(읽기) 하여 홍길동 객체변수에 복사하기
		StudentDto 홍길동 = stdList.get(0);// stdList get 0값을 홍길동에 복사함 위에서 
		//갱신했기도 했고 홍길동이라는 새로운 객체를 만들어 집어 넣은 것임
		
		
		System.out.println(홍길동.toString());
		System.out.println(홍길동.stName);
//	점(.)연산자를 통해 stName을 출력
		System.out.println(stdList.get(0).stName);

		
//		위의 홍길동과 마찬가지로 stdList 1번째는 성춘향이라는 객체에 넣은 것 
		StudentDto 성춘향 = stdList.get(1);
		StudentDto 김갑환 = stdList.get(1);// 이렇게 예시를 들었듯 알 수 있듯이 객체의 이름과 상관없이 새롭게 
//		만들어서 넣을 수 있음
		System.out.println(김갑환.toString());
//	성춘향의 이름 변수값만 출력해달라
		System.out.println(성춘향.stName);
		/*
		 * stList에서 .get(1)을 실행하는 순간 stList에 저장된 데이터 중에서 index1 의 데이터가 객체로 변환된다.
		 * 
		 * stdList.get(1)은 stdList는 stdList의 index1의 객체 데이터다
		 */
		System.out.println(stdList.get(1).stName);
		
		
		for(int i=0;i<stdList.size();i++) {
//		전체 std리스트 중에 이름만 출력하라
			String stName=stdList.get(i).stName;
			System.out.println(stName);
		}
	}
}
