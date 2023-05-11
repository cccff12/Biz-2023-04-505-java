package com.callor.Books.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.Books.models.AuthorDto;
import com.callor.Books.service.AuthorService;

public class AuthorServiceImplV2 implements AuthorService{
private List<AuthorDto> authorList;
	
	
	public AuthorServiceImplV2() {
		authorList= new ArrayList<>();
}

	public void loadAuthor() {
		// TODO Auto-generated method stub
		
	}

	public void printAuthorList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AuthorDto getAuthor(String code) {
		for(AuthorDto dto: authorList) {
//			아서코드하고 비교했을때 dto를 return한다
			if(dto.getAuCode().equals(code)) {
				return dto;
			}
		}
		
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
//	만약 아서 데이터가 없으면 
		if(authorList.isEmpty()) {
			this.loadAuthor();
		}
		return authorList;
	}

}
