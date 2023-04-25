package com.callor.classes.exec;

public class ExecD {
	public static void main(String[] args) {

		int name1 = (int)(Math.random()*50)+(int)(Math.random()*50);
		int name2 = 99;
		int name3 = (int)(Math.random()*50)+(int)(Math.random()*50);
		int name4 = 100;
		int name5 = (int)(Math.random()*50)+(int)(Math.random()*50);

		int sum = name1 + name2 + name3 + name4 + name5;
		float avg = (float) sum / 5;
		System.out.println("국어점수 합계" + sum);
		System.out.println("국어점수 평균" + avg);
	}

}
