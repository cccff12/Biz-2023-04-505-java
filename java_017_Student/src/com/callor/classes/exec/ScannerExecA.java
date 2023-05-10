package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerExecA {

	public static void main(String[] args) {
		InputStream is = System.in; // 입력한 정보를 읽어와서 IS에 저장하는 역할
		Scanner scan = new Scanner(is); // 저장한 IS 생성자를 통해 객체 scan을 생성

		System.out.println("문자열 입력");	
		String str = scan.nextLine();	// 문자열 str은 입력이다.
		System.out.println("입력한 문자열"+ str);
	}
}
