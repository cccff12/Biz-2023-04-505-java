package com.callor.scanner;

import java.util.Scanner;

public class ScannerF {

	public static void main(String[] args) {

		while (true) {
			int rndNum = (int) (Math.random() * 10) + 1;

			while (true) {
				System.out.println(" QUIT 입력시 종료 ");
				Scanner scan = new Scanner(System.in);
				int num2;
				
				System.out.print(" 정수 1~10 입력: ");
				String num = scan.nextLine();

				if (num.equals("QUIT")) {
					return;
				}

				try {
					num2 = Integer.valueOf(num);
				} catch (Exception e) {
					System.out.println(" 다시 입력");
					continue;
				}

				if (num2 == rndNum) {
					System.out.println(" 잘했어요");
					break;
				} else if (num2 > rndNum) {
					System.out.println(" 그 숫자보다 작다\n");
				} else if (num2 < rndNum) {
					System.out.println(" 그 숫자보다 크다\n");
				}

			}

			System.out.println("GAME OVER");
		}

	}

}
