package com.callor.controller;

public class test {
	public static void main(String[] args) {

		
		for(int in;in<100;in++) {
		int ran = (int) (Math.random() * 50) + 51;
		int i = 0;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				break;
			}
		}
		if(i==ran) {
			System.out.printf("%d는 소수", ran);	
		}else {
			System.err.printf("%d는 소수아님", ran);
		}
		
		
	}}
}
