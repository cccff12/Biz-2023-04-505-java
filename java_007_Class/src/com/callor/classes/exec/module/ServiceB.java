package com.callor.classes.exec.module;

public class ServiceB {

	public void scorePrint(int num1, int num2, int num3,String name) {
		
		int sum= num1+num2+num3;
		float flo=(float)(sum)/3;
		
		System.out.println("==================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d %f",
				name,num1,num2,num3, sum, flo);
		
		
		
	}



}
