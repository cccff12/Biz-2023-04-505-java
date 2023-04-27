package com.callor.classrs.exec;

public class StringA {

	public static void main(String[] args) {
		String str = "Republic of korea";

		System.out.println(str.substring(10));
// String.format: 결과를 콘솔에 출력안하고 다른 변수에 저장할수 있는 것
		String view = String.format("%d", 20);
		System.out.println(view);
	/*
	 * String.format()
	 * 문자열을 format 형식 문자열로 변환하는 method
	 * sys.out.printf()와 유사한데 
	 * printf은 결과를 console에 출력하면 끝인데
	 * 
	 //  String.format()은 결과를 다른 문자열 변수에 저장할 수 있다.
	 *  printf()는 아마도 void printf()일 것이고 
	 *  format()은 아마도 String format()이고 return문이 있을 것이다.
	 * 
	 * 
	 */
	
	int num=3;
	//num 변수에 저장된 값을 문자열로 변환하여 
	// result 문자열 변수에 저장하기
	String result= String.format("%d",num);
	
	result=String.format("값: %d", num);
	
	System.out.println(result);
	// %5d : 전체 5개의 자릿수를 확보하고 숫자를 오른쪽 정렬하는 문자열 생성
	result = String.format("값:%5d", num);
	System.out.println(result);
	
	result = String.format("값:%05d", num);
	System.out.println(result);
	

	result = String.format("값:S%05d", num);
	System.out.println(result);
//printf () 사용해 문자열 format을 지정하고 싶은데 
	//printf은 출력만 가능하다 그 이유는 printf() method는
	// void return type이기 때문이다.
	// printf() method를 대신해 결과를 변수에 저장하고 싶을때는 
	//String.format()을 사용한다
	
	
	
	
	}

}
