package com.callor.classes.exec;

import com.callor.classes.service.impl.StudentServiceimplV1;

public class StudentD {
	public static void main(String[] args) {
		
	
	StudentServiceimplV1 v1= new StudentServiceimplV1();
//	loadStudent를 실행하지 않는다면 객체가 리스트에 저장이 안되기 때문에 printStudent는 실행될수 없다
	v1.loadStudent();
	
//	
	v1.printStudent();
	}
}
