package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class ExecC {
	public static void main(String[] args) {
		List<String> strList = new ArrayList();
		strList.add("우리나라 만세");
		strList.add("우리나라 ");
		strList.add("만세");
//		기본생성자로 객체 초기화
		ClassE classE1= new ClassE();
		
//		임의생성자로 객체 초기화
		ClassE classE = new ClassE(strList);
		classE.printList();

	}
}
