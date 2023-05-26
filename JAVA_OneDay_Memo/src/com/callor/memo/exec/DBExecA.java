package com.callor.memo.exec;

import java.util.Scanner;

import com.callor.memo.service.MemoService;

public class DBExecA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemoService service = new MemoService();
		while (true) {
			System.out.println("메뉴 선택");
			System.out.println("1. 메모 전체 출력 2. 메모입력 3. 메모 수정 4. 메모삭제 5 메모검색");
			System.out.println("다른키 입력시 빠른종료");
			String choice = scan.nextLine();
			if (choice.equals("1")) {
				service.select();
			} else if (choice.equals("2")) {
				service.insert();
			} else if (choice.equals("3")) {
				service.update();
			} else if (choice.equals("4")) {
				service.delete();
			} else {
				System.out.println("종료됨");
				return;
			}

		}

	}
}
