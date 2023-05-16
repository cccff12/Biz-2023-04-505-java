package com.callor.student.exec;

import java.util.Scanner;

import com.callor.student.StudentService;
import com.callor.student.utils.Line;
import com.callore.student.service.impl.StudentServiceImplV22;

public class StudentExecG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StudentService stService = new StudentServiceImplV22();
		
		System.out.println(Line.dLine(100));
		System.out.println("대한고교 학사관리 2023");
		System.out.println(Line.dLine(100));

		while (true) {
			System.out.println("실행할 업무 선택");
			System.out.println("1. 학생 리스트 확인");
			System.out.println("2. 학생정보 추가/수정");
			System.out.println("3. 학생정보 삭제");
			System.out.println("9. 업무종료");
			System.out.println("업무선택>>");
			String strSelect = scan.nextLine();
			int intSelect = 0;

			try {

				intSelect = Integer.valueOf(strSelect);

			} catch (Exception e) {
				System.out.printf("업무선택 확인(%s)", strSelect);
				continue;
			}

			if (intSelect == 1) {

			} else if (intSelect == 2) {
				stService.insertStudent();
			} else if (intSelect == 3) {
				/*
				 * deletestudent는 service interface에 없는 메서드이다.
				 * 따라서 method를 포함하고 있는 class type로 stService를 객체
				 * 형변환을 해주어야 사용 가능
				 */
				
				((StudentServiceImplV22)stService).deleteStudent();
				
			} else if (intSelect == 9) {
				break;
			} else {
				System.out.printf("업무선택이 잘못되었습니다(%s)", intSelect);
			}

		}

		System.out.println("업무종료");

	}
}
