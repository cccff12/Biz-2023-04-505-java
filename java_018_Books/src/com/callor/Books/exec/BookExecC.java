package com.callor.Books.exec;

import com.callor.Books.service.BookService;
import com.callor.Books.service.Impl.BookServiceImplV2;

public class BookExecC {
public static void main(String[] args) {
	
	BookService bookService= new BookServiceImplV2();
	bookService.loadBook();
	bookService.printBookList();
}
}
