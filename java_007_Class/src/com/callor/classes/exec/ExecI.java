package com.callor.classes.exec;

import com.callor.classes.exec.module.MyClassC;

public class ExecI {
	public static void main(String[] args) {

		MyClassC myc = new MyClassC();
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int math = (int) (Math.random() * 50) + 51;
			if (myc.prime(math) != 0) {
				count++;
			}
		}
		System.out.println((count) + "은 소수의 개수");
	}
}
