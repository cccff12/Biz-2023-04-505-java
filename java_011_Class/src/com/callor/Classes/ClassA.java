package com.callor.Classes;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ClassA {
	
	public static void main(String[] args) {
		// Scanner 클래스 (도구)를 사용하여 연산 수행하기
		//Scanner 클래스를 사용하여 scan 객체 생성하기
		
		/*
		 * 여러가지 기능이 있지만 그중에 키보드로 입력한 데이터(문자 숫자 등) 을 
		 * 컴퓨터의 기억장소에 보관해주는 기능을 수행하는 클래스
		 * 
		 * Scanner 클래스는 혼자는 키보드 데이터를 가져올수 없다. 
		 * 키보드가 눌린 것을 알아채고, Scanner 에게 전달하여 데이터를 
		 * 읽을수 있도록 해주는 보조 도구가 있는데
		 * 그 도구가 System.in 이다
		 * 
		 * Scanner 클래스는 반드시 생성자 method에 System.in 도구를 전달해 주어야 한다.
		 * 
		 */
		Scanner scan= new Scanner(System.in);
		String str = scan.nextLine(); // 코드 blocking
		System.out.println("키보드로 입력한 문자열: "+ str);
		
		
		
		
	}
	
	
	
}