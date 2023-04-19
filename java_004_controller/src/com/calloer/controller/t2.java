package com.calloer.controller;

public class t2 {
public static void main(String[] args) {
		
		int nCount = 0;
		int nSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int  rndNum = (int)(Math.random() * 50) + 51;
			if(rndNum % 2 == 0) {
				nCount ++;
				// 누적 : 숫자값을 계속 쌓아서 덧셈
				//nSum += rndNum;
			nSum=nSum+rndNum;
			
			}
		}
		int rndAvg = nSum / nCount;
		System.out.printf("짝수의 개수 : %d \n",nCount);
		System.out.printf("짝수의 합계 : %d \n",nSum);
		System.out.printf("짝수의 평균 : %d \n",rndAvg);
		
	}
}
