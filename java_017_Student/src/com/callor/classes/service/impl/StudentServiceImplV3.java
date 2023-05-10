package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

/*
 * StudentServiceImplV1은 studentService interface를 implements하였고
 * StudentServiceImplV3은 studentServiceImplV1을 extends했다.
 */

public class StudentServiceImplV3 implements StudentService {

	protected List<StudentDto> stdList;

	public StudentServiceImplV3() {
		super();
		stdList = new ArrayList<>();

	}

	public void loadStudent() {
		String studentFile = "src/com/callor/classes/datas/student.csv";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("잘못입력");
			return;
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] student = line.split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
			stDto.stName = student[DataIndex.STUDENT.ST_NAME];
			stDto.stDep = student[DataIndex.STUDENT.ST_DEPT];
			stDto.Grade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
			stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
		
			stdList.add(stDto);
		
		}
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		int rows = 0;
		for (StudentDto stDto : stdList) { // 리스트가 stDto에 담겼다.
			System.out.print(stDto.stNum + "\t");
			System.out.print(stDto.stName + "\t");
			System.out.print(stDto.stDep + "\t");
			System.out.print(stDto.stTel + "\t");
			System.out.print(stDto.stAddress + "\n");
//			5줄 마다 구분선을 출력, 다만 구분선 출력 위치가 리스트의 끝보다 작을때만
			if (++rows % 5 == 0) {
				System.out.println(Line.SLINE(100));
			}

		}
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
