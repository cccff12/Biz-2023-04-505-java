package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService {
	Scanner scan;
	List<AccDto> AccList;

	public AccServiceImplV1() {
		scan = new Scanner(System.in);
		AccList = new ArrayList<>();

	}

	@Override
	public void accInit() {
		// TODO Auto-generated method stub

	}

	public void inout() {
		AccDto acdto = new AccDto();

		System.out.println("계좌번호 입력");
		String acnum = "";
		while (true) {
			try {
				acnum = scan.next();
				int num = Integer.valueOf(acnum);
				if (acnum.equals("quit"))
					;
			} catch (Exception e) {
				System.out.println("계좌번호는 정수로 입력해야 합니다");
				continue;
			}
			break;
		} // while 끝

		System.out.println("입금을 할려면 in, 출금을 할려면 out 입력 ");
		String selec = scan.nextLine();
		if (selec.equals("in")) {
			System.out.println("입금할 금액을 입력하세요");
			String innum = scan.nextLine();
			acdto.acInput = Integer.valueOf(innum);
		} else {
			System.out.println("정수만 입력하세요");
		}
		String out = scan.nextLine();
		if(selec.equals("out")) {
			System.out.println("출금할 금액을 입력하세요");
			String outnum= scan.nextLine();
			acdto.acOutput= Integer.valueOf(outnum);
			acdto.acInput-=acdto.acOutput;
		
		}
		
		acdto.acNum="0001";
		
	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savaAccList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub

	}

}
