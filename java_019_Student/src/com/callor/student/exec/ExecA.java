package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class ExecA {

	public static void main(String[] args) {
		List<StudentDto> stdList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		/*
		 * 어떤 데이터를 입력할것인가 라는 안내메세지
		 *  각 속성을 입력할떄 prompt 보이기
		 */

		StudentDto stdto = new StudentDto();

		System.out.println(Line.dLine(100));
		System.out.println("학생정보입력");
		System.out.println(Line.sLine(100));
		System.out.println("학번 >> ");
		stdto.stNum = scan.nextLine();
		System.out.println("학생이름 >> ");
		stdto.stName = scan.nextLine();
		System.out.println("학과 >> ");
		stdto.stDept = scan.nextLine();
		System.out.println("학년(정수) >> ");
		stdto.stGrade = Integer.valueOf(scan.nextLine());
		System.out.println("전화번호 >> ");
		stdto.stTel = scan.nextLine();
		stdList.add(stdto);

		System.out.println(stdList.toString());
		scan.close();
	
	
//	field 생성자를 이용해 객체 생성
		
//		stDto= new StudentDto(
//		stNum, stName, stDept,
//		Integer.valueOf(stGrade), stTel)
//		
	
	
		
		
	
	}

}
