package com.callor.classes.exec;

import com.callor.classes.exec.module.ServiceF;

public class ExecO {
public static void main(String[] args) {
	
	ServiceF serviceF= new ServiceF();
	int ran1=(int)(Math.random()*50)+51;
	int ran2=(int)(Math.random()*50)+51;
	int ran3=(int)(Math.random()*50)+51;
	int ran4=(int)(Math.random()*50)+51;
	int ran5=(int)(Math.random()*50)+51;
	int ran6=(int)(Math.random()*50)+51;
	int ran7=(int)(Math.random()*50)+51;
	
	serviceF.score(ran1,ran2,ran3,ran4,ran5,ran6,ran7);
	
}
}
