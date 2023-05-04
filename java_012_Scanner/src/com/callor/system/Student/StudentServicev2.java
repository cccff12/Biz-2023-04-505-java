package com.callor.system.Student;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServicev2 {
	private StudentDto[] stList;

	public void inputStudents() {
		Scanner scan = new Scanner(System.in);

		stList = new StudentDto[5];

		while (true) {

			System.err.println(" 학생정보");
			int intNum = 0;
			while (true) {
				System.out.println("학번 1~5>>");
				String stNum = scan.nextLine();
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력");
					continue;
				}

				if (intNum < 0) {
					return;
				}
				if (intNum < 1 || intNum > stList.length + 1) {
					System.out.println("학번은 1~5까지 입력하라");
					continue;
				}
				break;
			}

			System.out.println(" 이름>>");
			String stName = scan.nextLine();

			StudentDto student = new StudentDto();

			student.setStNum(String.format("%04d", intNum));

			student.setStName(stName);

		}

	}

}
