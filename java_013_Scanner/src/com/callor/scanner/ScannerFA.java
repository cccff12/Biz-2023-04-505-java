package com.callor.scanner;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ScannerFA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 정수형 배열 6개를 만들어라
		/// - 정수형 요소 6개를 갖는 nums배열을 생성하라
		int[] nums = new int[6];
		// nums배열에 담긴지 확인해야 함

		int numsIndex=0;// nums 의 어느 위치를 알려줄 변수
		
		
		
		// nums배열요소에 한 번도 저장되지 않은 rndNum값 찾기
		while (true) {

			int rndNum = (int) (Math.random() * 45) + 1;
			System.out.println(rndNum);
			int searchindex;
			// 배열에 중복되는 값이 있는지 검사
			 for(int i=0;i<nums.length;i++) {
				 if(nums[i]==rndNum) {
					 rndNum=(int)(Math.random()*45)+1;
					 i= -1;
			} // for

			// rndNum 에 저장된 값이 nums요소에 있으면 다시 while() 처음으로
			// 검사결과 없으면 for가 끝난 다음에 나옴
			 
			} // if

			// 여기에 도달하면 rndNum는 중복되지 않은 랜덤수
			while (true) {

				System.out.print("정수 입력(QUIT는 종료)>>");
				String strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println(" 게임을 중단");
					return;

				}

				int intNum = 0;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("입력오류");
					System.out.println("정수만 입력");
					continue;

				}

				if (intNum < 0 || intNum > 45) {
					System.out.println("1~45범위의 정수만 입력하라");
				} else if (rndNum == intNum) {
					System.out.println("잘했다");
					nums[numsIndex++]= rndNum;
					break;

				}else if(rndNum>intNum) {
					System.err.println(intNum+"입력값 작다 ");
				}else if (rndNum<intNum) {
					System.err.println(intNum+"입력값 크다 ");
				// nums배열의 어느 위치에 rndNum를 저장해야 하나?

			} // 숫자 맞추기 while
			// 잘했다 break 만났을때 진행할 곳
				if(numsIndex>=nums.length) {
					break;
				}
		} // 1st while
			System.out.println("game over");
			for(int i=0;i<nums.length;i++) {
				
			}
	}
}
}