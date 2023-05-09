package com.callor.classes.exec;

import com.callor.classes.service.impl.StudentServiceimplV1;

public class StudentD {
	public static void main(String[] args) {
		
	
	StudentServiceimplV1 v1= new StudentServiceimplV1();
	v1.loadStudent();
	v1.printStudent();
	}
}
