package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceimplV1;

public class StudentExecA {
	public static void main(String[] args) {
//		interface로 객체선언, class의 생성자로 객체 생성
		StudentService stService = new StudentServiceimplV1();
		stService.loadStudent();
		stService.printStudent();
		StudentDto stDto = stService.getStudent("S0001");
		
//		null safe coding 
//		method를 호출하여 return값을 결과로 하여 다른 객체변수에 
//		저장을 하고, 객체의 속성, method들을 통하여 다른 일을
//		수행하려고 할때, 객체 자체가 null값인 경우 "Nullpointexception"이
//		발생한다
//		이러한 상황을 미리 예측하고, 대비하는 코드
		if(stDto!=null) {
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());
		}else {
			System.out.println("찾는 데이터가 없음");
		}
		
		
//		exception safe, exception handlering
		try {
			System.out.println(stDto.stNum);
//			Exception이 발생하면 catch문 밑에 코드가 실행됨
		} catch ( Exception e) {
			System.out.println("찾는 데이터가 없음");
		}
		
		
		
		
	}

}
