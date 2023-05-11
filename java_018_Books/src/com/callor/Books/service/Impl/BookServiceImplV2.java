package com.callor.Books.service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.Books.models.BookDto;
import com.callor.Books.service.BookService;
import com.callor.book.config.DataIndex;
import com.callor.book.config.Utils;

public class BookServiceImplV2 implements BookService {
//   도서정보.txt파일을 읽어서
//	List<BookDto> type리스트 데이터로 변환하는 method

	protected List<BookDto> bookList;

	public BookServiceImplV2() {
		bookList = new ArrayList<>();
	}

	public void loadBook() {

		String bookFile = "src/com/callor/book/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			BookDto bDto = new BookDto();
			bDto.setbIsbn(book[DataIndex.Book.ISBN]);
			bDto.setbTitle(book[DataIndex.Book.TITLE]);
			bDto.setbPublisher(book[DataIndex.Book.PUBLISHER]);
			bDto.setbAuthor(book[DataIndex.Book.AUTHOR]);
			bDto.setbPublishDate(book[DataIndex.Book.PDATE]);
			bDto.setbPages(Integer.valueOf(book[DataIndex.Book.PAGES]));
//			"  가나다   " : 문자열 앞 뒤에 space가 포함된 상태
//			   가나다
//			"  1000   "  : Integer.valueOf("  1000  ")- 이걸 실행하면 
//			빈칸이 있어서 numberformatException 발생
//			이러한 상황에서 숫자 앞 뒤에 붙이었는 space를 제거해줘야 한다
//			그럴떄 우리는 
//			다른변수 = 문자열변수.trim()
			String strPrice = book[DataIndex.Book.PRICE].trim();
			bDto.setbPrice(Integer.valueOf(strPrice));
			bookList.add(bDto);
		}
		scan.close();
	}

	public void printBookList() {

		String[] printTitle = "isbn,도서명,출판사,저자,출판일,페이지,가격".split(",");

		System.out.println(Utils.dLine(100));

		System.out.printf("%-13s\t", printTitle[DataIndex.Book.ISBN]);
		System.out.printf("%-20s\t\t", printTitle[DataIndex.Book.TITLE]);
		System.out.printf("%s\t", printTitle[DataIndex.Book.PUBLISHER]);
		System.out.printf("%s\t", printTitle[DataIndex.Book.AUTHOR]);
		System.out.printf("%s\t", printTitle[DataIndex.Book.PDATE]);
		System.out.printf("%s\t", printTitle[DataIndex.Book.PAGES]);
		System.out.printf("%s\n", printTitle[DataIndex.Book.PRICE]);
		System.out.println(Utils.sLine(100));
		for (BookDto book : bookList) {
			System.out.printf("%s\t", book.getbIsbn());
			String bTitle = book.getbTitle();
			if (bTitle.length() > 10) {
				System.out.printf("%-20s\t", bTitle.substring(0, 10));
			}else {
				System.out.printf("%-20s\t",book.getbTitle());
			}
			
			
			System.out.printf("%s\t", book.getbPublisher());
			System.out.printf("%s\t", book.getbAuthor());
			System.out.printf("%s\t", book.getbPublishDate());
			System.out.printf("%s\t", book.getbPages());
			System.out.printf("%s\n", book.getbPrice());
		}
		System.out.println(Utils.sLine(100));
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
