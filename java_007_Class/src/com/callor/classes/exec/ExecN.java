package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceE;

public class ExecN {
	public static void main(String[] args) {
		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMath = (int) (Math.random() * 50) + 51;

		ServiceE servicee = new ServiceE();

		servicee.score(intKor, intEng, intMath);

	}
}
