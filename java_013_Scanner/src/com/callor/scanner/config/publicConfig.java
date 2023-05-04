package com.callor.scanner.config;

public class publicConfig {
	/*
	 * 변수 선언문에 static 이 추가된 경우를
	 * `클래스 변수`라고 한다
	 * 프로젝트가 시작될때 자동으로 생성(선언, 초기화)되는 변수
	 * 이 변수는 클래스를 객체로 생성하지 않아도 사용할수 있는 변수다
	 * 
	 * ------일반적인 클래스에 선언된 변수 사용하기 위해서는 객체 선언이 먼저 되어야 한다----
	 * 일반적으로 class obj=new class()
	 * obj.변수=30; --------이렇게 해야 하는데
	 * 
	 * 하지만 클래스 변수는 객체로 선언하지 않고 직접 호출할수 있다.
	 * 여기서는 Config.변수=30;
	 *    		sysout.(Config.변수);
	 * 
	 * 
	 */
	
	
	public static String dLine="=".repeat(60); // static이 있다면 다른 클래스에서 객체를 새로 저장 안해도 사용 가능하다
	public static String sLine="-".repeat(60);
	
	
	
}
