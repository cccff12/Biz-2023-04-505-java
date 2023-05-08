package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {
	public static void main(String[] args) {
//		java 1.7 이후 버전에서는 생성자에는 generic( <> ) 을 생략해도 된다
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			numList.add(ran);
		}

		for (int i = 0; i < numList.size(); i++) {
			for (int u = i + 1; u < numList.size(); u++) {
				if (numList.get(i) > numList.get(u)) {
					int num = numList.get(u);
					numList.remove(u);
					numList.add(i, num);
				}

			}

		}
//		List type 의 객체 변수에는 toString() method 가 포함되니까
//		단순히 List의 값들을 출력할수 있다.
		System.out.print(numList.toString());
	}

}
