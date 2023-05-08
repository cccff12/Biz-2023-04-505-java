package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StudentDto;

public class t1 {
public static void main(String[] args) {
	
	StudentDto stdto= new StudentDto();
	
	stdto.setStName("깁철갑수");
	stdto.setStNum("2");
	stdto.setStGrade(6);
	stdto.setStDept("오징어 심리 정밀 분석학과");
	stdto.setStTel("001\5415d541351351351353\n");
	
	List<StudentDto> list= new ArrayList<>();
	list.add(stdto);
	
	stdto= new StudentDto("김갑철김갑수","5","골프공 줍기학과",7,"없음");
	list.add(stdto);
	
	System.out.println(list.toString());
	
	
	
	
}
}
