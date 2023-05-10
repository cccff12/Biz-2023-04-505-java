package com.callor.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecB {

	public static void main(String[] args) {

		String studentFile = "src/com/callor/classes/datas/student.csv";
		String saveFile = "src/com/callor/classes/datas/student-save.csv";
//	객체를 선언만 할때 null값을 저장하여 초기화를 하면
//		객체때문에 발생하는 메모리 관련 문제를 조금 줄일 수 있다.
		Scanner fileScan = null;
//		inputstream is= new fileinputsream(studentfile)

		/*
		 * InputStream 도구 컴퓨터의 외부로부터 데이터를 메모리로 load하는데 사용하는 도구들의 부모
		 */
		InputStream is = null;// 파일 정보를 읽어와서 is에 저장하는 역할
		try {
			is = new FileInputStream(studentFile); // studentfile 을 is에 읽을 준비를 하겠다
//			기억장치 안으로 읽어 오기 위한 도구`fileinputstream`
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileScan = new Scanner(is);// system in 이 아니라 다른 도구를 씀
		String line = fileScan.nextLine();
		System.out.println(line);
		System.out.println(fileScan.nextLine());
		System.out.println(fileScan.nextLine());
		System.out.println(fileScan.nextLine());
		for(int i=0;i<100-4;i++) {
			System.out.println(fileScan.nextLine());
		}
	
	}

}
