package com.callor.shop.service;

import java.util.List;

import com.callor.shop.model.BuyerDto;

public interface BuyerService {

	public List<BuyerDto> selectAll(); // 전체 검색
	public BuyerDto findById(String id);// id 찾기
	public int insert(BuyerDto dto); // 고객정보 입력
	public int update(BuyerDto dto); // 고객정보 업데이트
	
}
