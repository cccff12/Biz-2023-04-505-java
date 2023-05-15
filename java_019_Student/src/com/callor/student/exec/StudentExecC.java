package com.callor.student.exec;

import com.callor.student.StudentService;
import com.callore.student.service.impl.studnetServiceImplV1;

public class StudentExecC {

	/*
	 * v1클래스는 작성하는 개발자가 테스트를 위해 작성하는 코드
	 * 
	 * Implv1클래스에는 insertStudent()라는 method를 작성했다.
	 * 하지만 studentService interface에는 insertStudnet()method가 없다.
	 * 
	 * 1. Service interface 에 insertStudent()method를 추가해 주기를 바람
	 * 이 상황이 발생하면 사전에 팀원들간의 업무 조율이 명확하게 이루어지고
	 * 모든 팀원이 공감한다면 상관없다
	 * 실제 상황에서는 이러한 문제가 발생하면 프로젝트 전체에 영향을 미치게 된다.
	 * 
	 * 또한 계속해서 이 프로젝트에서 insertStudent()method를 계속 사용할 예정이라면 이 방법이 최선이다
	 * 하지만 어떤 특정 개발자의 필요에 의해 insertstudent()method가 작성되었다면 , 절대 해서는 안될 일이다.
	 * 
	 * 2. 객체의 형변환을 통하여 생성된 객체를 자신의 Implv1클래스로 형변환하여
	 *  임시로 method를 사용하는 방법
	 * 
	 * 
	 */
	public static void main(String[] args) {
		StudentService stService = new studnetServiceImplV1();
		/*
		 * stService는 StudentService(interface) type의 객체이다.
		 * 그리고 insertStudent()method는 
		 * StudentServiceImplV1 클래스에 정의된 method이다
		 * 이러한 상황에서 insertStudent () method를 테스트 하기 위해 
		 * stService 객체를 형변환 하여 수행한다.
		 * 
		 */
		((studnetServiceImplV1) stService).insertStudent();
		stService.printStudent();
	}
}
