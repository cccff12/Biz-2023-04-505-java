package com.callor.classes.exec;

import com.callor.classes.models.StdData;

public class ExecF {

	
	public static void main(String[] args) {
		
//		배열의 크기와 index값을 알고 있을떄,
//		또는 배열의 일부 요소만 사용하고 싶을때
		for (int i = 0; i < StdData.STUDENT.length; i++) {
			System.out.println(StdData.STUDENT[i]);
		}
//		index 0~4번까지 데이터만 사용하고 싶을때
		for (int i = 0; i <5; i++) {
			System.out.println(StdData.STUDENT[i]+"\n");
		}
		
//		배열의 크기와 index를 모르거나 몰라도 될때 
//		전체 배열의 요소를 사용하고 싶을때
		
		for(String str:StdData.STUDENT) {
			System.out.println(str);
			
		}
	
	
	}
	
	
	
}
