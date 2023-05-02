package com.callor.Classes;

import java.util.Scanner;

public class ClassD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력>>>");//prompt
		scan.nextLine();//모든 문자열 입력
		
		System.out.print("정수입력>>");//prompt
		scan.nextInt();// 모든 정수만 입력
		System.out.print("실수입력 입력>>");//prompt
		scan.nextFloat();// 모든 실수만 입력
		
	}
}
