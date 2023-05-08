package com.callor.classes;

import java.util.List;

public class ClassC {
	/*
	 * 변수의 접근 제한자
	 * public 으로 선언된 변수는 어디에서나 접근 가능하다.
	 * 하지만 private으로 선언된 변수는 현재 클래스의 메서드에서만
	 * 접근이 가능하다
	 * public 으로 선언된 변수는 예기치 않게 다른 곳에서 변수 값이 변경될수 있다.
	 * 변수의 값을 보호하기 위해서 변수를 private 로 선언하고 
	 * getter, setter mothod를 통해 접근하도록 한다.
	 * 
	 * `protected` 접근 제한자:
	 * 현재 클래스를 상속받은 클래스에서만 자유롭게 
	 * public 처럼 자유롭게 접근이 가능하도록 하는 접근제한자 
	 * 
	 * 상속을 해주는 부모 클래스를 만들때 
	 * 상속을 받는 자식 클래스에서 변수에 자유롭게 접근하도록 하는 키워드이다. =protected
	 * 
	 */
	protected List<Integer> numList;

	public void printList() {
		/*
		 * println 나 numList.toString() method를 실행하여
		 * return 되는 문자열을 받고 Console에 출력하라
		 * .toString() 이 생략된 코드로 생각하면 된다.
		 */
		System.out.println(numList);
	}

}
