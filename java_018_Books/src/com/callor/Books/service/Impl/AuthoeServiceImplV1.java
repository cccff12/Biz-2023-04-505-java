package com.callor.Books.service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.Books.models.AuthorDto;
import com.callor.Books.service.AuthorService;
import com.callor.book.config.Utils;

public class AuthoeServiceImplV1 implements AuthorService {

	List<AuthorDto> list;

	public AuthoeServiceImplV1() {
		list = new ArrayList<>();
	}

	public void loadAuthor() {
		String str = "src/com/callor/book/data/저자정보(2023-05-11).txt";
		Scanner scan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] author = line.split(",");
			AuthorDto atDto = new AuthorDto();
			atDto.setAuCode(author[0]);
			atDto.setAuName(author[1]);
			atDto.setAuTel(author[0]);
			atDto.setAuAddress(author[3]);
			list.add(atDto);
		}
	}

	public void printAuthorList() {

		System.out.println(Utils.dLine(100));
		System.out.printf("%-5s\t%-5s\t%-20s\t%-20s\n", "저자코드", "저자명", "전화번호", "주소");
		System.out.println(Utils.sLine(100));
		for (AuthorDto adto : list) {
			System.out.printf("%-5s", adto.getAuCode() + "\t\t");
			String aname = adto.getAuName();
			if (aname.length() > 3) {
				System.out.print(aname.substring(0,3)+"\t\t");
			}else {System.out.printf("%-5s", adto.getAuName() + "\t\t");
			}

			System.out.printf("%-5s", adto.getAuTel() + "\t\t");
			System.out.printf("%-5s", adto.getAuAddress() + "\n");
		}
		System.out.println(Utils.sLine(100));
	}

	public AuthorDto getAuthor(String code) {
		for (AuthorDto dto : list) {
			if (dto.getAuCode().equals(code)) {
				return dto;
			}
		}
		return null;
	}

	public List<AuthorDto> getAuthorList() {
		for (AuthorDto dto : list) {
			return list;
		}
		return null;
	}
}
