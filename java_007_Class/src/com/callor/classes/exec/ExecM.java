package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceD;

public class ExecM {

	public static void main(String[] args) {

		ServiceD serviceD = new ServiceD();
		int ran1 = (int) (Math.random() * 50) + 51;
		int ran2 = (int) (Math.random() * 50) + 51;

		serviceD.add(ran1, ran2);

	}

}
