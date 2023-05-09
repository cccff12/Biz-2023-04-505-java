package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceimplV1 implements StudentService{
	
	
	List<StudentDto> stdList = new ArrayList<>();
	
	public void loadStudent() {
		for (int i = 0; i < StdData.STUDENT.length; i++) {
			String[] stddata = StdData.STUDENT[i].split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = stddata[StdData.ST_NUM];
			stDto.stName = stddata[StdData.ST_NAME];
			stDto.stDep = stddata[StdData.ST_DEPT];
			int ran = Integer.valueOf(stddata[StdData.ST_GRADE]);
			stDto.Grade = ran;
			stDto.stTel = stddata[StdData.ST_TEL];
			stDto.stAddress = stddata[StdData.ST_ADDRESS];
			stdList.add(stDto);
	}
	}
	
	public void printStudent() {
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		for(int i= 0; i< stdList.size();i++) {
			System.out.print(stdList.get(i).stNum+"\t");
			System.err.print(stdList.get(i).stName+"\t");
			System.out.print(stdList.get(i).stDep+"\t");
			System.out.print(stdList.get(i).Grade+"\t");
			System.out.print(stdList.get(i).stTel+"\t");
			System.out.print(stdList.get(i).stAddress+"\n");
		
		}
		
		
		
	}

}
