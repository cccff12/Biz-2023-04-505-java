package com.callor.bank.exec;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExecA {
	/*
	 * 컴퓨터 프로그래밍에서 날짜와 관련된 데이터, 정보에는 상당히 많은 이슈가 있다.
	 * 자바에서는 1.8을 기준으로 날짜와 시간을 처리하는 방식이 차이가 있다
	 * 또한 프로그래밍 언어, 시스템, 국가, 소프트웨어 마다 처리하는 방식이 차이가 있다.
	 * 
	 * 그래서 날짜와 관련된 이슈를 피해가기 위하여 여러가지 기법이 사용되는데
	 * 그중 많이 사용하는 방법중 하나가 날짜 type의 데이터를 문자열로 변환하여
	 * 사용하는 방법이다.
	 */
	public static void main(String[] args) {

		//	java1.7이하에서 사용하는 날짜 type의 객체
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.toString());

		
		SimpleDateFormat Dateformat= new SimpleDateFormat("YYYY-mm-dd");
		SimpleDateFormat Timeformat= new SimpleDateFormat("HH:mm:ss");
		
//		날짜 type의 데이터를 String.format type의 문자열로 변환하기
		String dateString = Dateformat.format(date);
		String timeformat= Timeformat.format(date);
		
		
		// java 1.8부터 사용하는 날짜 type의 객체
		LocalDate localdate = LocalDate.now();//now는 static method
		LocalTime localtime= LocalTime.now();
		LocalDateTime localDateTime= LocalDateTime.now();
		
		DateTimeFormatter dateFormat1=DateTimeFormatter.ofPattern("YYYY-mm-dd");
		DateTimeFormatter timeFormat1= DateTimeFormatter.ofPattern("HH:mm:ss");
		
		
		System.out.println(localdate.format(dateFormat1));
		System.out.println(localdate.format(timeFormat1)); 
		
		System.out.println(localDateTime.format(dateFormat1));
		System.out.println(localDateTime.format(timeFormat1)); 
		
		
		
	}
}
