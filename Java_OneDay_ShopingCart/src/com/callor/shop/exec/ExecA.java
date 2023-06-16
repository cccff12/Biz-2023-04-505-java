package com.callor.shop.exec;

import java.util.Scanner;

import com.callor.shop.service.ShopingcartService;

public class ExecA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShopingcartService shoping = new ShopingcartService();
		while (true) {
			System.out.println("=".repeat(70));
			System.out.println("빛나라 쇼핑몰 2023");
			System.out.println("=".repeat(70));
			System.out.println("상품관리");
			System.out.println("-".repeat(70));
			System.out.println("\t1. 상품리스트");
			System.out.println("\t2. 상품등록 및 수정");
			System.out.println("-".repeat(70));
			System.out.println("고객관리");
			System.out.println("-".repeat(70));
			System.out.println("\t3. 고객리스트");
			System.out.println("\t4. 고객등록 및 수정");
			System.out.println("-".repeat(70));
			System.out.println("상품판매");
			System.out.println("-".repeat(70));
			System.out.println("\t5. 장바구니 상품 담기");
			System.out.println("\t6. 구매자별 장바구니 리스트 보기");
			System.out.println("\t7. 장바구니 전체 리스트 보기");
			System.out.println("-".repeat(70));
			System.out.println("QUIT. 끝내기");

			System.out.println("선택>>");
			System.out.println("끝내기>> QUIT");
			String str = scan.nextLine();
			if (str.equals("QUIR")) {
				return;
			}
			if (str.equals("1")) {
				shoping.productlist();
			} else if (str.equals("2")) {
				shoping.productin();
			} else if (str.equals("3")) {
				shoping.buyerprint();
			} else if (str.equals("4"))
				shoping.buyerinsert();
			else if (str.equals("5")) {
				shoping.shopinglist();
			} else {
				System.out.println("업무선택은 1~7까지 중에 선택하세요");
				continue;
			}
		}

	}

}
