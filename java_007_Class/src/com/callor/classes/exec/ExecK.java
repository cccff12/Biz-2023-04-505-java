package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceB;

public class ExecK {

	public static void main(String[] args) {
		
		ServiceB scoreprint=new ServiceB();
		
		int ran1=(int)(Math.random()*50)+51;
		int ran2=(int)(Math.random()*50)+51;
		int ran3=(int)(Math.random()*50)+51;
		String name= "홍길동";
		scoreprint.scorePrint(ran1,ran2,ran3,name);
		
	}

}
