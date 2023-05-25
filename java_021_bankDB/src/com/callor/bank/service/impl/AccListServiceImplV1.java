package com.callor.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.callor.bank.config.DBConnection;
import com.callor.bank.model.AccListDto;
import com.callor.bank.service.AccListService;

public class AccListServiceImplV1 implements AccListService  {

	protected Connection dbConn;
	
	public AccListServiceImplV1() {
		super();
		dbConn= DBConnection.getDBConn();
	}

	@Override
	public List<AccListDto> selecAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccListDto findById(long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AccListDto dto) {
		String sql= " INSERT into tbl_acclist "
				+ " (aioSEQ, acNum,aioDate, aioTime, aioDiv, aioInput, aioOutput) "
				+ " VALUES(seq_acclist.nextval, ?, ?, ?, ?, ?, ? ) ";
//		계좌번호 거래일자 거래시각 거래구분(입금 출금) 입금액 출금액
		
		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.acNum);
			pStr.setString(2, dto.aioDate);
			pStr.setString(3, dto.aioTime);
			pStr.setString(4, dto.aioDiv);
			pStr.setInt(5, dto.aioInput);
			pStr.setInt(6, dto.aioOutput);
			
//			쿼리 실행하는 method
//			select : excutequery()
//			insert update, delete: executeupdate()
			pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
		
		
	}

	@Override
	public List<AccListDto> findByDateDestance(String sDate, String eDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccListDto> findByAcNum(String acNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccListDto> findByAcNumAndDateDest(String acNum, String sDate, String eDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(AccListDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return 0;
	}

}
