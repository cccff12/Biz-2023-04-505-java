package com.callor.bank.service;

import java.util.List;

import com.callor.bank.model.BuyerDto;

public interface BuyerService {

	
//	전체 List를 조회하는 메서드
	public List<BuyerDto> selectAll();
	
//	pk를 기준으로 1개의 데이터를 조회하는 메서드
	public BuyerDto findById(String id);
	
//	1개의 데이터를 DB에 추가하는 메서드
	public int insert(BuyerDto dto);
	
//	데이터를 update(수정)하는 메서드
	public int update(BuyerDto dto);
	
//	pk를 전달받아 1개의 데이터를 삭제하는 메서드
	public int delete(String id);
	
	
}
