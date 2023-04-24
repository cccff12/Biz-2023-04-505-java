package com.callor.classes.exec;

import java.util.Scanner;

import com.callor.classes.exec.module.MyClassA;

public class ExecD {

	public static void main(String[] args) {

		// MyClassA type에 myA 객체를 선언하고, MyClassA 생성자 method를 사용하여
		// myA객체를 초기화한다.

		MyClassA myA = new MyClassA();
//		String type str 객체를 선언하고, String ()생성자 method를 사용하여
//		str 객체를 초기화한다.
		String str = new String("Republic of korea");

		/*
		 * Scanner type의 scan객체를 선언하고, Scanner()생성자 method를 
		 * 사용하여 scan 객체를 초기화 한다.
		 */
		Scanner scan = new Scanner(System.in);

		/*
		 * class type 의 객체를 선언하고 
		 * -class type 이란 변수를 선언하고 keyword가 class 
		 * -class type으로 선언된 변수를 객체라고 한다
		 * -선언되지 않은 변수는 초기화 저장 읽기 쓰기 등이 되지 않는다.
		 * 즉 사용할수 없다
		 * 
		 * 객체를 생성자 method를 사용하여 초기화한다.
		 * -객체(변수)를 완전히 사용가능한 상태로 만들기
		 * -객체를 초기화하지 않으면, 일부 기능만 사용할수 있다.
		 * 
		 * 일반 변수는 값을 저장, 할당, 대입하면 초기화가 된다
		 * 객체는 클래스의 생성자 method()를 사용해 초기화한다.
		 */
		
		
		
	}

}
