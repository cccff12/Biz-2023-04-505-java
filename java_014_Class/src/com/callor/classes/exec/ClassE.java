package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassE {
	public static void main(String[] args) {

		
		/*
		 * Generic type: <>로 감싸진 클래스 type
		 * numList에 추가할수 있는 데이터는 정수만 가능하도록 한다.
		 * List<>꺽쇠 안의 타입은 오로지 클래스 타입만 사용 가능하다.
		 */
		
		
		
		List<Integer> numList = new ArrayList<>();

		System.out.println(numList.size());

//		List type의 변수에 아이템 추가하기
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		
		System.out.println(numList.size());
		
		numList.add(3,100);// index 3번 위치에 100의 값을 추가하기
		numList.add(3,200);
		
		for(int i=0; i<numList.size();i++) {
			System.out.print(numList.get(i)+"\t");
		}
		
		
	}
}
