package com.callor.Books.exec;

import com.callor.Books.service.AuthorService;
import com.callor.Books.service.Impl.AuthoeServiceImplV1;

public class AuthorExecA {
public static void main(String[] args) {
	AuthorService V1=new AuthoeServiceImplV1();
V1.loadAuthor();
V1.printAuthorList();


}
}
