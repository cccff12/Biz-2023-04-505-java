package com.callor.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {

	private Scanner scan = new Scanner(System.in);

	public int getNum() {

		int primeNum = 0;

		while (true) {
			System.out.println("정수를 입력하세요");
			String strNum = scan.nextLine();
			if (strNum.equals("q")) {
				return -1;
			}
			
			try {
				primeNum = Integer.valueOf(strNum);
				if (primeNum >= 3) {
					break;
				}
				
			} catch (Exception e) {
				System.out.println("정수만을 정확히 입력해 주세요");
			}
		}
		return primeNum;
	}
	
	public int primeYesNo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}
}