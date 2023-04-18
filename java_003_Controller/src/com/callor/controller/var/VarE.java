package com.callor.controller.var;

public class VarE {
	public static void main(String[] args) {
		String str = "Republic of korea";
		// 여기 빈칸은 spacebar랑 다르다 진짜 빈칸이다
		String nation = "";

		// str에 저장된 문자열을 12번째에서 잘라
		// 오른쪽의 문자열을 nation 변수에 저장
		nation = str.substring(12);
		System.out.println(nation);

		// str에 저장된 문자열을 9번째에서 한 번 자르고
		// 11번째에서 또 한번 잘라 그 사이의 문자열을 출력
		System.out.println(str.substring(9, 10));
	
	
	}
}
