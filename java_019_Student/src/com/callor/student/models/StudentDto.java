package com.callor.student.models;

public class StudentDto {
	public String stNum;
	public String stName;
	public String stDept;
	public int stGrade;
	public String stTel;

	
	
	
	
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
// 이건 생성자 바로 위에 해야함
	
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param stDept
	 * @param stGrade
	 * @param stTel
	 */ 

	public StudentDto(String stNum, String stName, String stDept, int stGrade, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stGrade = stGrade;
		this.stTel = stTel;
	}

}