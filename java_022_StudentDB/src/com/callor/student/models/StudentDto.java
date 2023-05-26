package com.callor.student.models;

public class StudentDto {

//	 변수 이름이 데이터 베이스 칼럼 이름과 완벽하게 같아야 함
	public String st_num;//	VARCHAR2(10)
	public String st_name;//	nVARCHAR2(20)
	public String st_dept;	//nVARCHAR2(20)
	public int st_grade;//	NUMBER
	public String st_tel;//	VARCHAR2(10)
	
	
	@Override
	public String toString() {
		return "StudentDto [st_num=" + st_num + ", st_name=" + st_name + ", st_dept=" + st_dept + ", st_grade="
				+ st_grade + ", st_tel=" + st_tel + "]";
	}
	public StudentDto(String st_num, String st_name, String st_dept, int st_grade, String st_tel) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_dept = st_dept;
		this.st_grade = st_grade;
		this.st_tel = st_tel;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
