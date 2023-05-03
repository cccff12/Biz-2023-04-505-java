package com.callor.system.exec;

public class StringB {

	// 문자열 변수는 생성하는 방법이 크게 2 가지가 있다.
	 // 일반적인 방법: String str1="korea"
	//클래스 객체 타입으로 생성하는 방법: String str3=new String("korea")
	
	// 문자열 변수는 생성하는 방법에 따라 같은 값 비교의 결과가 다르게 나타난다
	// 따라서 같은 값 비교를 절대 EQ(==)로 사용하면 안된다.
	
	public static void main(String[] args) {
	
	
	String str1 ="korea";
	String str2 ="korea";// 일반적 변수
	// 클래스 타입은 저장되는 주소를 저장하고 일반적 변수는 값을 저장하기 떄문에 비교할수 없다.
	String str3 =new String("korea");// 클래스 타입으로 만드는 방법
	String str4 =new String("korea");
	String str5="KOREA" ;
	
	System.out.printf("%s, %s, %s, %s, %s", str1, str2, str3, str4, str5);
	// 문자열을 비교할떄는 == 이 코드를 쓰면 안된다.
	System.out.println(str1==str2);
	
	System.out.println(str1==str2);
	System.out.println(str3==str4);

	System.out.println(str1==str4);
/*
 * ㅇㅇㅇㅇㅇㅇㅇㅇㅇ
 */
/*
 * 
 */

}
}
