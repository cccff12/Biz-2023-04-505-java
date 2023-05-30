package com.callor.shop.service;

import com.callor.shop.model.IolistDto;

public interface IolistService {

	public IolistDto findByseq(long seq);
	public int insert(IolistDto dto);
	public int update(IolistDto dto);
	
}
