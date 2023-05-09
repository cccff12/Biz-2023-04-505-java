package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceimplV1 implements StudentService{
	
//	 클래스 영역에 필드 변수로 StudentDto List 선언
//	매서드 영역에 로컬 변수로 stdList= new ArrayList<>(); 초기화
	List<StudentDto> stdList; 
	
	
	public void loadStudent() {
		stdList= new ArrayList<>();
		for (int i = 0; i < StdData.STUDENT.length; i++) {
			String[] stddata = StdData.STUDENT[i].split(",");
//			StudentDto type의 객체를 생성하고
			StudentDto stDto = new StudentDto();
//	student 배열의 각 요소를 StudentDto type 객체 요소에 저장하기
			stDto.stNum = stddata[StdData.ST_NUM];
			stDto.stName = stddata[StdData.ST_NAME];
			stDto.stDep = stddata[StdData.ST_DEPT];
			int ran = Integer.valueOf(stddata[StdData.ST_GRADE]);
			stDto.Grade = ran;
			stDto.stTel = stddata[StdData.ST_TEL];
			stDto.stAddress = stddata[StdData.ST_ADDRESS];
//			List <StudentDto> type의 리스트에 추가하기
			stdList.add(stDto);
	}
	}
	
	public void printStudent() {
		stdList= new ArrayList<>();
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호\t주소");
		System.out.println("-".repeat(70));
		for(int i= 0; i< stdList.size();i++) {
			System.out.print(stdList.get(i).stNum+"\t");
			System.out.print(stdList.get(i).stName+"\t");
			System.out.print(stdList.get(i).stDep+"\t");
			System.out.print(stdList.get(i).Grade+"\t");
			System.out.print(stdList.get(i).stTel+"\t");
			System.out.print(stdList.get(i).stAddress+"\n");
		
		}
		System.out.println("=".repeat(70));
		
		
	}

	
	/*
	 * stdList 에서 stNum학번의 학생데이터를 찾아서
	 * 학생데이터를 return 
	 */
	public StudentDto getStudent(String stNum) {
		for(StudentDto stdto: stdList) {
			if(stdto.stNum)
		}
		
		
		return null;
	}

}
