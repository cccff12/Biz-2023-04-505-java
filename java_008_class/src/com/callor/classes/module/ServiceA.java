package com.callor.classes.module;

public class ServiceA {
public void score(int ran1,int ran2,int ran3,int ran4,int ran5,int ran6,int ran7) {
	int sum= ran1+ran2+ran3+ran4+ran5+ran6+ran7;
	float avg= sum/7f;
	System.out.printf("국어: %d 영어:%d 수학: %d 국사:%d 음악:%d 미술:%d 체육:%d 총점:%d 평균: %f",
			ran1,ran2,ran3,ran4,ran5,ran6,ran7,sum,avg);
	
	
}
	
	
	
}
