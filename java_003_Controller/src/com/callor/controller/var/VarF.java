package com.callor.controller.var;

public class VarF {
	public static void main(String[] args) {
		String str = "Republic of korea";
		char cVar = str.charAt(3);
		System.out.println(cVar);

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + ",");
		}
		System.out.println();

		System.out.println(str.length());

	}

}
