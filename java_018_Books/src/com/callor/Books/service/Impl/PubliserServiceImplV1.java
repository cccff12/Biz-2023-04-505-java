package com.callor.Books.service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.Books.models.PubliserDto;
import com.callor.publisher.service.PublisherService;

public class PubliserServiceImplV1 implements PublisherService {

	List<PubliserDto> list;

	public PubliserServiceImplV1() {
		list = new ArrayList<>();
	}

	public void loadPubliser() {
		Scanner scan = null;
		InputStream is = null;
		String str = "src/com/callor/book/data/출판사정보(2023-05-11).txt";
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String publiser = scan.nextLine();
			String[] num = publiser.split(",");
			PubliserDto pdto = new PubliserDto();

			pdto.setPubCode(num[0]);
			pdto.setPubName(num[1]);
			pdto.setPubCeo(num[2]);
			pdto.setPubTel(num[3]);
			pdto.setPubAddress(num[4]);
			list.add(pdto);
		}

	}

	public void printPubliserList() {

		System.out.println("-".repeat(100));
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "출판사코드", "출판사명", "대표", "전화번호", "주소");
		System.out.println("-".repeat(100));
		for (PubliserDto dto : list) {
			System.out.printf("%-5s\t", dto.getPubCode());
			System.out.printf("%-5s\t", dto.getPubName());
			System.out.printf("%-5s\t", dto.getPubCeo());
			System.out.printf("%-5s\t", dto.getPubTel());
			System.out.printf("%-5s\n", dto.getPubAddress());

		}
		System.out.println("-".repeat(100));

	}

	public void getPubliserListByName(String name) {
		Scanner scan=new Scanner(System.in);
		System.out.println("글자입력 : ");
		scan.nextLine();
		for(int i=0;i<list.size();i++) {
			if(scan.nextLine().lastIndexOf(i)) {
				
			}
		}
		
		
	}

}
