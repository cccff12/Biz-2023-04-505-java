package com.callor.classes.models;

public class StudentDto {

	/*
	 * 클래스 변수
	 * 속성
	 * 필드
	 * public 접근제한자가 설정되어있기 때문에 
	 * 변수에 직접 접근 가능
	 */
	public String stNum;
	public String stName;
	public String stDep;
	public int Grade;
	public String stTel;
	public String stAddress;
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDep=" + stDep + ", Grade=" + Grade
				+ ", stTel=" + stTel + ", stAddress=" + stAddress + "]";
	}

}
