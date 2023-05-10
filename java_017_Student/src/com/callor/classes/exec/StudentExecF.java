package com.callor.classes.exec;

import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV3;

public class StudentExecF {

	
	public static void main(String[] args) {
		
		// 인터페이스로 설정하고 생성자로 생성하기
		StudentService stService= new StudentServiceImplV3();

	stService.loadStudent();
	stService.printStudent();
	
	System.out.println(stService.getStudent("S0010"));
	
	
	}
	
	
}
