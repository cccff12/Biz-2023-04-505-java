package com.callor.shop.service;

import java.util.List;

import com.callor.shop.model.ProductDto;

public interface ProductService {

	
	public List<ProductDto> selectAll(); // 전체 판매 리스트
	public ProductDto findBypCode(String pCode); // 상품코드 찾기 
	public int insert(ProductDto dto); // 상품정보 입력
	public int update(ProductDto dto); // 상품정보 업데이트
	
	
}
