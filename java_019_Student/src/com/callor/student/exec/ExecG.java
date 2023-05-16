package com.callor.student.exec;

import com.callor.student.StudentService;
import com.callore.student.service.impl.StudentServiceImplV22;

public class ExecG {
public static void main(String[] args) {
	StudentService stservice= new StudentServiceImplV22();
	stservice.insertStudent();
	
}
}
