package com.callor.system.exec;

import java.util.Scanner;

import com.callor.system.Student.StudentServicev2;
import com.callor.system.models.StudentDto;

public class StudentD {
	public static void main(String[] args) {

		StudentServicev2 stservicev2 = new StudentServicev2();

		StudentDto[] stList = new StudentDto[5];
		
		stservicev2.print();
		
		
	}
}
