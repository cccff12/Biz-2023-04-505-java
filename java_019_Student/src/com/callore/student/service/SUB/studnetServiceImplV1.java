package com.callore.student.service.SUB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.StudentService;
import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class studnetServiceImplV1 implements StudentService {

	protected List<StudentDto> stdList;
	protected Scanner scan;

	public studnetServiceImplV1() {
		stdList = new ArrayList<>();
		scan = new Scanner(System.in);

	}

	/*
	 * insertStudent()는 studnetservice interface에 정의되지 않은 method 이 method는 상속받은 것이
	 * 아닌 v1클래스에서 임의의 생성한 method이다.
	 */

	public void insertStudent() {

		System.out.println(Line.dLine(60));
		System.out.println("학생정보 추가 종료하려면 quit입력");
		System.out.println(Line.sLine(60));

		while (true) {
			System.out.println("QUIT입력시 종료");
			String quit = scan.nextLine();
			if (quit.equals("QUIT")) break;

			System.out.print("학번 >> ");
			String stNum = scan.nextLine();
			if (quit.equals("QUIT")) break;
			
			System.out.print("이름 >> ");
			String stName = scan.nextLine();
			if (quit.equals("QUIT")) break;
			
			System.out.print("학과 >> ");
			String stDept = scan.nextLine();
			if (quit.equals("QUIT")) break;
			
			System.out.print("학년 >> ");
			String stGrade = scan.nextLine();
			int stgrade = Integer.valueOf(stGrade);
			if (stgrade > 4 || stgrade < 1) {
				System.out.println("학년은 1~4만 입력한다\n\n");
				continue;
			}
			
			System.out.print("전화번호 >> ");
			String stTel = scan.nextLine();
			if (quit.equals("QUIT")) break;
			
			StudentDto stDto = new StudentDto();
			stDto.stNum = stNum;
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = stgrade;
			stDto.stTel = stTel;
			stdList.add(stDto);
			continue;
			
		}//end while
	System.out.println("학생정보 입력 종료");
	}

	public void loadStudent() {

	}

	@Override
	public void printStudent() {
		System.out.println(Line.dLine(100));
		System.out.println("대한고교 학생 리스트");
		System.out.println(Line.sLine(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLine(100));
		if (stdList == null || stdList.size() < 1) {
			System.out.println("표시할 데이터가 없음");
			return;
		}

		for (StudentDto dto : stdList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%d\t", dto.stGrade);
			System.out.printf("%s\n", dto.stTel);

		}
		System.out.println(Line.dLine(100));

	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

}
