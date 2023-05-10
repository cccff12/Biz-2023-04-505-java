package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceimplV1 implements StudentService {

//	 클래스 영역에 필드 변수로 StudentDto List 선언
//	매서드 영역에 로컬 변수로 stdList= new ArrayList<>(); 초기화

	protected List<StudentDto> scList;

//	변수의 초기화, 객체의 초기화, 변수의 생성, 변수의 초기화
//	변수, 객체를 사용가능한 상태로 만드는 것
//	scList를 초기화하여 사용가능하도록 생성
	public StudentServiceimplV1() {
		scList = new ArrayList<>();
	}

	protected StudentDto str2Dto(String str) {
		String[] stddata = str.split(",");
//	StudentDto type의 객체를 생성하고
//	ScoreDto 클래스는 field생성자가 있다
//	field 생성자를 통하여 데이터가 포함된 scDto 객체를 생성
		StudentDto stDto = new StudentDto();
//student 배열의 각 요소를 StudentDto type 객체 요소에 저장하기
		stDto.stNum = stddata[DataIndex.STUDENT.ST_NUM];
		stDto.stName = stddata[DataIndex.STUDENT.ST_NAME];
		stDto.stDep = stddata[DataIndex.STUDENT.ST_DEPT];
		int ran = Integer.valueOf(stddata[DataIndex.STUDENT.ST_GRADE]);
		stDto.Grade = ran;
		stDto.stTel = stddata[DataIndex.STUDENT.ST_TEL];
		stDto.stAddress = stddata[DataIndex.STUDENT.ST_ADDRESS];
		return stDto;

	}
//	List <StudentDto> type의 리스트에 추가하기
	
	
	protected void printHeader() {
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호\t주소");
		System.out.println("-".repeat(70));
	}
	
	
	

	public void loadStudent() {
		printHeader();
		
		for (String str : DataSource.STUDENT) {
			StudentDto dto = str2Dto(str);
			scList.add(str2Dto(str));
		}
	}

	protected void printStudent(StudentDto dto) {
		for (int i = 0; i < scList.size(); i++) {
			System.out.print(scList.get(i).stNum + "\t");// 만약 확장 for 문을 사용한다면 scList.get(i) 이 조건인 dto가 된다
			System.out.print(scList.get(i).stName + "\t");
			System.out.print(scList.get(i).stDep + "\t");
			System.out.print(scList.get(i).Grade + "\t");
			System.out.print(scList.get(i).stTel + "\t");
			System.out.print(scList.get(i).stAddress + "\n");
	}
		System.out.println(Line.dLINE(100));
	}
	/*
	 * stdList 에서 stNum학번의 학생데이터를 찾아서 학생데이터를 return
	 */
	public StudentDto getStudent(String stNum) {
		for (StudentDto dto : scList) {
			if (stNum.equals(dto.stNum)) {
				return dto;
			}
		}
		return null;
	}

}
