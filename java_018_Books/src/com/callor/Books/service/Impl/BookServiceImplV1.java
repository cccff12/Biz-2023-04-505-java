package com.callor.Books.service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.Books.models.BookDto;
import com.callor.Books.service.BookService;

public class BookServiceImplV1 implements BookService {

	List<BookDto> list;

	public BookServiceImplV1() {
		list = new ArrayList<>();

	}

	@Override
	public void loadBook() {
		String str= "src/com/callor/book/data/도서정보(2023-05-11).txt";
		Scanner scan= null;
		InputStream is= null;
		try {
			is = new FileInputStream(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan= new Scanner(is);
		while(scan.hasNext()) {
			String line= scan.nextLine();
			String[] str1= line.split(",");
			BookDto bdto= new BookDto();
			bdto.setbIsbn(str1[0]);
			bdto.setbTitle(str1[1]);
			bdto.setbPublisher(str1[2]);
			bdto.setbAuthor(str1[3]);
			bdto.setbPublishDate(str1[4]);
			bdto.setbPages(Integer.valueOf(str1[5]));
			bdto.setbPrice(Integer.valueOf(str1[6].trim()));
			list.add(bdto);	
		}
	}

	public void printBookList() {
System.out.println("=".repeat(180));
		System.out.println("ISBN\t\t도서명\t\t출판사\t저자\t발행일\t페이지\t가격");
		System.out.println("=".repeat(180));
		
		for(BookDto bdto: list) {
			System.out.print(bdto.getbIsbn()+"\t");
			System.out.print(bdto.getbTitle()+"\t");
			System.out.print(bdto.getbPublisher()+"\t");
			System.out.print(bdto.getbPublishDate()+"\t");
			System.out.print(bdto.getbAuthor()+"\t");
			System.out.print(bdto.getbPages()+"\t");
			System.out.print(bdto.getbPrice()+"\n");
		}
		
		
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
