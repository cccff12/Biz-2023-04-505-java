package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 50) + 51;
		// i를 2~ 자신 -1 까지 연속된 정수를 만드는 코드

		int prime = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				// System.out.println(num + "소수아님");
				prime = i;
			break;

		}

		if (prime == 0) {
			System.out.println(num + "는 소수");
		} else {
			System.out.println(num + "는 소수 아님");
		}

		
	//yes no flag변수
		boolean isprime=true;
		for(int i = 0; i<num;i++) {
			if(num%i==0) {
				isprime=false;
			}
		}
		
		
	}
}
