package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceImplV1 implements AccService {

	List<AccDto> list;
	Scanner scan;
	BuyerServiceImplV1 buv1 = new BuyerServiceImplV1();

	public AccServiceImplV1() {
		list = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	/*
	 * 신규계좌 등록하기 
	 * 1. 고객번호를 입력받고, 
	 * 2. 고객번호가 고객정보 있는가 확인
	 * BuyerServiceImplV1.getBuyer()method 사용해 고객정보 찾기 없다면 : 
	 * 고객정보를 등록하세요 라고 메세지 표현
	 * 3. 고객번호가 있으면 신규 계좌를 생성 List<AccDto>type accList에 추가
	 * 
	 */

	public void accInit() {
		System.out.println(" 고객번호를 입력하세요 : ");
		String acNum = scan.nextLine();
		AccDto acdto = new AccDto();
		for (AccDto dto : list) {
			if (dto.acNum == null) {
				System.out.println("고객정보를 등록하세요");
			} else if (dto.acNum.equals(acNum)) {
				System.out.println("동일한 번호존재");
				list.add(acdto);
			}
			break;
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
