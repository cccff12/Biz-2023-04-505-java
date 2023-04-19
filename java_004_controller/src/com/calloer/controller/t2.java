package com.calloer.controller;

public class t2 {
public static void main(String[] args) {
		
	
		int rndNum =  (int)(Math.random() *50) + 51;
		// 이 for() 명령에 의해
		// index 값은 2 부터 rndNum - 1까지 연속된
		// 정수로 만들어저 for() {} 에서 사용가능하다
		for(int index = 2 ; index < rndNum ; index ++) {
			if(rndNum % index == 0) {
				System.out.print(rndNum + " : ");
				System.out.print(index + "로 나누면 나머지가 ");
				System.out.print(rndNum % index);
				System.out.println(" 이 수는 소수가 아님");
				// 반복문을 수행하며 연산을 실행하는 과정에서
				// 소수가 아님을 판별하면 더이상 반복문을
				// 진행할 필요가 없으므로 여기 중단
				// break : for() 반복문을 중단할때
				// 		for() 반복문 밖에서는 사용할수 없음
				break;
			}
		}
	}

}