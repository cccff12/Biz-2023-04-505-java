package com.callor.bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.AnsiConsol;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Line;

public class AccServiceImplV1A implements AccService {

	protected List<AccDto> accList;
	protected BuyerService buyerService;
	protected Scanner scan;

	public AccServiceImplV1A() {

		accList = new ArrayList<>();
		buyerService = new BuyerServiceImplV1A();
		scan = new Scanner(System.in);
	}
//	새로운 계좌번호 자동 생성
	/*
	 * 계좌번호 format 1000-2023-05-18-0001
	 * 
	 * "1000" : 은행 코드 "2023-05-18": 계좌를 신설한 날짜 "0001" : 일련번호
	 */

	protected String getNewAccNum() {
//		컴퓨터의 현재 시각을 get하는 클래스
//		System.currentTimeMillis()
//		1970.1. 00:00:00:000 부터 시작하여
//		현재시점까지 카운트된 밀리세컨드 값
//		이 값을 Date클래스의 생성자에 전달하면 
//		현재 날짜, 시각 정보를 알수 있는 객체로 생성
		Date date = new Date(System.currentTimeMillis()); // 시간 값을 데이터한테 보내서 시간 객체를 만듬
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);

		int maxNum = 0;
		String numBank = "1000";
		for (AccDto accDto : accList) {

//			1000-2023-05-18-0001
//			1000-2023-05-18-0002
//			1000-2023-05-18-0003
//			1000-2023-05-18-0004
//			1000-2023-05-18-0005

			String accNum = accDto.acNum;

//			처음의 4 글자를 잘라서 bank코드 추출하기
			numBank = accNum.substring(0, 4);

//			날짜 부분 추출하기
			String numDate = accNum.substring(5, todayString.length());

			if (numDate != null && numDate.equals(todayString)) {
//				일련번호 부분만 추출하기
				String lastNum = accNum.substring(numBank.length() + todayString.length());
				int intNum = Integer.valueOf(lastNum);
				if (maxNum > intNum)
					maxNum = intNum;

			}

		} // end for
//	maxnum은 0 또는 최대값
		String newNum = String.format("%s-%s-%04d", numBank, todayString, maxNum + 1);
		return newNum;

	}

	@Override
	public void accInit() {
		Config.bankTitle("계좌생성");

		String strBuid = "";
		while (true) {
			String accNUM= getNewAccNum(); 
			System.out.println(Line.sLine(100));
			System.out.println("생성된 계좌번호:"+accNUM);
			System.out.println(Line.dLine(100));
			
			while (true) {

				System.out.println("고객번호를 입력해 주세요");
				System.out.println("고객번호");
				strBuid = scan.nextLine();
				if (strBuid.equals("quit"))
					break;
				try {
					int intBuid = Integer.valueOf(strBuid);
					strBuid = String.format("%04d", intBuid);
					BuyerDto buyerDto = buyerService.getBuyer(strBuid);// ???
					if (buyerDto == null) {
						System.out.println(AnsiConsol.message("BLUE", "고객정보가 없습니다"));
						System.out.println("고객정보를 먼저 등록해 주세요");
					} else {
						System.out.println(Line.dLine(100));
						System.out.println(buyerDto.toString());
						System.out.println(Line.sLine(100));
					}

				} catch (Exception e) {

					System.out.println("고객번호는 정수로 입력");
				}

			}

		}

	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub

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
