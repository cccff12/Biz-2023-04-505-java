package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceA;

public class ExecJ {
	public static void main(String[] args) {

		ServiceA plus = new ServiceA();

		int ran1 = (int) (Math.random() * 50) + 51;
		int ran2 = (int) (Math.random() * 50) + 51;

		int result = plus.add(ran1, ran2);

		System.out.println(result);
	}
}