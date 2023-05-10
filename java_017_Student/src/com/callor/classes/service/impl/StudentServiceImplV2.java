package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV2 implements StudentService {

	List<StudentDto> stdList;

	public StudentServiceImplV2() { // superclass로 만들어야 한다.
		stdList = new ArrayList();
	}

	public void loadStudent() {
		String str = "src/com/callor/classes/datas/student.csv";
		Scanner filescan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		filescan = new Scanner(is);
		while (filescan.hasNext()) {
			String file = filescan.nextLine();
			String[] student = file.split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
			stDto.stName = student[DataIndex.STUDENT.ST_NAME];
			stDto.stDep = student[DataIndex.STUDENT.ST_DEPT];
			stDto.Grade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
			stDto.stTel = student[DataIndex.STUDENT.ST_TEL];
			stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
			stdList.add(stDto);
		}
	}

	public void printStudent() {

		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		int rows = 0;
		for (StudentDto stDto : stdList) { // 리스트가 stDto에 담겼다.
			System.out.print(stDto.stNum + "\t");
			System.out.print(stDto.stName + "\t");
			System.out.print(stDto.stDep + "\t");
			System.out.print(stDto.stTel + "\t");
			System.out.print(stDto.stAddress + "\n");
//			5줄 마다 구분선을 출력, 다만 
			if (++rows % 5 == 0) {
				System.out.println(Line.SLINE(100));
			}

		}

	}

	public StudentDto getStudent(String stNum) {
		return null;
	}

}
