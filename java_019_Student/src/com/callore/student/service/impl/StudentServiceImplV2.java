package com.callore.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;
import com.callor.student.utils.Index;
import com.callor.student.utils.Line;

/*
 * insertStudent, printstudent loadstudent 를 모두 상속받는다.
 */

public class StudentServiceImplV2 extends studnetServiceImplV1 {

	protected StudentDto inputStream() {

		System.out.println(Line.dLine(60));
		System.out.println("학생정보 추가 종료하려면 quit입력");
		System.out.println(Line.sLine(60));
		System.out.println("끝낼려면 QUIT");
		String quit = scan.nextLine();
		if (quit.equals("QUIT")) {
		}

		StudentDto stDto = new StudentDto();
		String stNum = "";
		while (true) {
			System.out.println("학번(정수)");
			stNum = scan.nextLine();
			try {
				int intNum = Integer.valueOf(stNum);
				stNum = String.format("%04d", intNum);
				break;
			} catch (Exception e) {
				System.out.println("학번은 정수로 입력");
				continue;
			}

		}

		System.out.println("학생이름");
		String stName = scan.nextLine();

		System.out.println("학생학과");
		String stDept = scan.nextLine();

		System.out.println("학생학년");
		int stGrade = Integer.valueOf(scan.nextLine());

		System.out.println("학생학과");
		String stTel = scan.nextLine();

		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = stGrade;
		stDto.stTel = stTel;
		stdList.add(stDto);
		return stDto;

	}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public void insertStudent() {
		// v2에서 상속받은 v1을 먼저 실행해달라
		super.insertStudent();

		while (true) {
			StudentDto stDto = this.inputStream();
			if (stDto == null)
				break;
			int index = 0;
			for (index = 0; index < stdList.size(); index++) {
				/*
				 * inputstudent 가 return 한 dto하고 리스트의 요소 중에서 
				 * 참조한 dto하고 주소가 일치한가? 주소가 일치한다면
				 * stdlist에 있는 요소 이다.
				 */

				if (stdList.get(index) == stDto) {
					break;
				}
			}
			if (index >= stdList.size()) {
				stdList.add(stDto);
			}

			stdList.add(stDto);
		}

		// 그리고 나머지는 여기서 처리함
		System.out.println("여기는 V2");

		String str = "src/com/callor/student/student.txt";
		OutputStream os = null;
		PrintWriter out = null;

		StudentDto stDto = new StudentDto();

		while (true) {
			System.out.println("끝낼려면 QUIT");
			String quit = scan.nextLine();
			if (quit.equals("QUIT")) {
				break;
			}

			String stNum = "";
			while (true) {
				System.out.println("학번(정수)");
				stNum = scan.nextLine();
				try {
					int intNum = Integer.valueOf(stNum);
					stNum = String.format("%04d", intNum);
					break;
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력");
					continue;
				}
			}

			System.out.println("학생이름");
			String stName = scan.nextLine();

			System.out.println("학생학과");
			String stDept = scan.nextLine();

			System.out.println("학생학년");
			int stGrade = Integer.valueOf(scan.nextLine());

			System.out.println("학생학과");
			String stTel = scan.nextLine();

			for (StudentDto dto : stdList) {
				if (dto.stNum.equals(stNum)) {
					System.out.println(Line.sLine(100));
					System.out.println("동일학번 학생 데이터 있음");
					System.out.println(dto.stNum.toString());
//			dto의 어떤 데이터가 stDto에 저장될까
					stDto = dto;
				}
			}

			stDto.stNum = stNum;
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = stGrade;
			stDto.stTel = stTel;

			stdList.add(stDto);

		}

// 			데이터 저장 완료

//			이후 out  os = new FileOutputStream(Config.STUDENT_FILE); 

//			FileOutputStream, PrintWriter 을 열고 출력할 파일을 넣고
//			그 다음 클로즈를 해야함 os의 경우 2번째 
// 			위에서 리스트에 dto를 담았으니 출력을 위해 try문 안에서 os와 out에 담는다.
		try {
			os = new FileOutputStream(Config.STUDENT_FILE);
			out = new PrintWriter(os);

			for (StudentDto dto : stdList) {
				out.printf("%s\t", dto.stNum);
				out.printf("%s\t", dto.stName);
				out.printf("%s\t", dto.stDept);
				out.printf("%d\n", dto.stGrade);
				out.printf("%d\n", dto.stTel);
			}
			out.close();
			os.close();
//			try 문을 2번 쓰지 않고 한번에 씀

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void loadStudent() {
		super.loadStudent();
		System.out.println("이제 v2실행");
		String str = "src/com/callor/student/student.txt";
		Scanner scan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String scanstr = scan.nextLine();
			String[] spr = scanstr.split(",");

			try {
				StudentDto stdto = new StudentDto();
				stdto.stNum = spr[Index.STUDENT.ST_NUM];
				stdto.stName = spr[Index.STUDENT.ST_NAME];
				stdto.stDept = spr[Index.STUDENT.ST_DEPT];
				stdto.stGrade = Integer.valueOf(spr[Index.STUDENT.ST_GRADE]);
				stdto.stTel = spr[Index.STUDENT.ST_TEL];
				stdList.add(stdto);
			} catch (Exception e) {
				System.out.println("에러 발생");
			}

		}
		scan.close();
		System.out.println("load한 데이터 개수" + stdList.size());
	}

}
