package com.callor.Books.exec;

import com.callor.Books.service.Impl.PubliserServiceImplV1;
import com.callor.publisher.service.PublisherService;

public class PubliserExecA {

	public static void main(String[] args) {
		PublisherService per= new PubliserServiceImplV1();
	per.loadPubliser();
	per.printPubliserList();
	
	}
	
}
