package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentC {
	public static void main(String[] args) {

		List<StudentDto> stdList = new ArrayList<>();

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
}
