package com.callor.classes;

import java.util.List;

/*
 * 클래스 e는 2개의 생성자 method를 가지고 있따
 *  한개는 매개변수가 없는 생성자 = 기본생성자
 *  한개는 strList매개변수를 가지고 있으며,
 *  this.strList를 초기화 시키는 코드가 있다.
 *  
 *  = 임의 생성자
 */

public class ClassE {

	private List<String> strList;
// 기본생성자
//	클래스의 임의 생성자를 만들게 되면,
//	기본생성자가 자동으로 만들어지지 않는다.
//	임의생성자를 만들려면 기본생성자도 만들어야 한다.
	public ClassE() { //매개변수가 없는것
		// TODO Auto-generated constructor stub
	}
// 임의생성자
	public ClassE(List<String> strList) { // 매개변수가 있는것
		this.strList = strList;

	}

	public void printList() {
		System.out.println(strList.toString());
	}

}
