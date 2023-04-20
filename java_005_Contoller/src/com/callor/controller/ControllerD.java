package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {

		
		for(int i= 0;i<100;i++) {
		int ran = (int) (Math.random() * 50) + 51;
		for (i = 0; i <ran; i++) {
			
			if(ran%i==0 ) {
				break;
			}
			}
		if(ran<=i) {
			System.out.println(ran+"는 소수");
		}
		
		}
		}

}
