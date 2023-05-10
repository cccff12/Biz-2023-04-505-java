package com.callor.classes.exec;

import com.callor.classes.service.impl.StudentServiceImplV2;

public class ExecD {
public static void main(String[] args) {
	StudentServiceImplV2 v2= new StudentServiceImplV2();
	v2.loadStudent();
	v2.printStudent();

}

}


