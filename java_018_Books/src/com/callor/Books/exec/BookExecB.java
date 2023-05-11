package com.callor.Books.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BookExecB {

//	ISBN,도서명,출판사,저자,발행일,페이지,가격
//	 0     1      2     3     4       5     6    

	/*
	 * 도서정보 .txt 파일을 열어서 각 line을 읽은 후 index0~index8번까지 데이터를 console에 출력
	 */

	public static void main(String[] args) {
		String bookFile = "src/com/callor/book/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();

			System.out.println(bookFile + "파일이 없습니다.");
			return;
		}
		/*
		 * inputstream을 사용해 직접 파일 내용을 읽을수 있습니다.
		 * 하지만 많은 코딩을 해야한다. 그래서 쉽게
		 * 텍스트 파일을 읽어서 메모리로 가져오기 위해 
		 * scanner도구를 연결해 사용하는 것이다.
		 */
		
		scan = new Scanner(is);
		System.out.println("=".repeat(100));
		System.out.println("ISBN\t도서명\t출판사\t저자\t발행일\t페이지\t가격");
		System.out.println("-".repeat(100));
		
		int rows=0;
		
		while (scan.hasNext()) {
			String line= scan.nextLine();
			String[] book= line.split(",");
			rows++;
			if(book.length<7) {
				System.out.printf("%d 번째 현재 데이터 문제",rows);
				System.out.println(line);
				break;
				
			}else {
				System.out.printf("%s\t", book[0]);
				System.out.printf("%s\t", book[1]);
				System.out.printf("%s\n", book[2]);		
			}
			
			
			
			
				
		}
		scan.close();
		
	}

}
