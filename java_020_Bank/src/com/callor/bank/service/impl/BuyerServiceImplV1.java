package com.callor.bank.service.impl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.Line;

public class BuyerServiceImplV1 implements BuyerService {
	List<BuyerDto> list;

	public BuyerServiceImplV1() {
		super();
		list = new ArrayList<>();
	}

	@Override
	public void loadBuyer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printBuyerList() {
		// TODO Auto-generated method stub

	}

	@Override
	public BuyerDto getBuyer(String buId) {
		return null;
	}

	@Override
	public void inputBuyer() {
		
		System.out.println(Line.dLine(100));
		System.out.println("고객정보 입력");
		System.out.println(Line.sLine(100));
		
		System.out.println("그만할려면 quit입력");
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("고객ID 입력");
			String bid = "";
			BuyerDto bydto = new BuyerDto();
			while (true) {
				bid = scan.nextLine();
				if (bid.equals("quit"))
					break;
				try {
					int intid = Integer.valueOf(bid);
					bid = String.format("%04d", intid);
					break;	
				} catch (Exception e) {
					System.out.println("정수로 4자리 입력해 주세요");
					continue;
				}
				
			}
			if (bid.equals("quit"))
				break;
			for (BuyerDto dto : list) {
				if (dto.buId.equals(bid)) {
					System.out.println("동일한 id이미 존재");
					System.out.println(dto.buId.toString());
					bydto = dto;
				}

			}

			System.out.printf("이름입력(%s) : ", bydto.buName == null ? "신규" : bydto.buName);
			String bname = scan.nextLine();
			if (bname.equals("quit"))
				break;

			System.out.printf("전화입력(%s) : ", bydto.buTel == null ? "신규" : bydto.buTel);
			String btel = scan.nextLine();
			if (btel.equals("quit"))
				break;

			System.out.printf("주소입력(%s) : ", bydto.buAddr == null ? "신규" : bydto.buAddr);
			String baddr = scan.nextLine();
			if (baddr.equals("quit"))
				break;

			System.out.printf("생일입력(%s) : ", bydto.buBirth == null ? "신규" : bydto.buBirth);
			String bbirth = scan.nextLine();
			if (bbirth.equals("quit"))
				break;

			System.out.printf("직업입력(%s) : ", bydto.buJob==null? "신규": bydto.buJob);
			String bjob = scan.nextLine();
			if (bjob.equals("quit"))
				break;

			bydto.buId = bid;
			bydto.buName = bname;
			bydto.buTel = btel;
			bydto.buAddr = baddr;
			bydto.buBirth = bbirth;
			bydto.buJob = bjob;
			list.add(bydto);	

			int num=0;
			
			while(true) {
				for(BuyerDto dto: list) {
						
					
				}
				
				
			}
			
			
		} // while 끝
		
		
		
	}// inputBuyer 끝

	@Override
	public void printBuyerList(PrintWriter out) {
		// TODO Auto-generated method stub
		
	}

}
