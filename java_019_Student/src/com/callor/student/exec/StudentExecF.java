package com.callor.student.exec;

import com.callor.student.StudentService;
import com.callore.student.service.impl.StudentServiceImplV22;

public class StudentExecF {

	public static void main(String[] args) {
		
		
		StudentService v2= new StudentServiceImplV22();
		
		v2.loadStudent();
		v2.printStudent();
		v2.insertStudent();
		
	}
	
	
}
