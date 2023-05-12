package com;

public class t1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 50) + 51;

		for (int i = 0; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + "은 소수가 아니다");
			}else {
				System.out.println(num + "은 소수다");
			}
		}

	}

}
