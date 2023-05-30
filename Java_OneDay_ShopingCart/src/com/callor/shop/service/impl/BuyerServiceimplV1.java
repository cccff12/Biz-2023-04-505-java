package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.model.BuyerDto;
import com.callor.shop.service.BuyerService;

public class BuyerServiceimplV1 implements BuyerService {

	protected final Connection dbConn;
	public BuyerServiceimplV1() {
		dbConn = DBConnection.getDBConn();
	}

	
	
	protected BuyerDto resultDto(ResultSet result) {
		try {
			BuyerDto buydto = new BuyerDto();
			buydto.buId = result.getString(DBContract.BUYER.BUID);
			buydto.buName = result.getString(DBContract.BUYER.buName);
			buydto.buTel = result.getString(DBContract.BUYER.buTel);
			buydto.buAddr = result.getString(DBContract.BUYER.buAddr);
			return buydto;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public List<BuyerDto> selectAll() { // 전체 조회
		List<BuyerDto> buyerlist = new ArrayList<>();
		String sql =
				" SELECT " 
				+ " buId, buName, buTel, buAddr "
				+ " FROM tbl_buyer "
				+ " ORDER BY buId  ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				BuyerDto buyerDto = resultDto(result);
				buyerlist.add(buyerDto);
			}
			return buyerlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public BuyerDto findById(String id) {// id찾기
		String sql = 
		" SELECT buId, buname, butel, buaddr "
				+ " FROM tbl_buyer "
				+ " WHERE buid = ? ";
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, id);
			ResultSet result = pStr.executeQuery();
			if(result.next()) {
				return resultDto(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	
	
	public int insert(BuyerDto dto) {
	String sql= " INSERT INTO tbl_buyer(buId, buName, buTel, buAddr) "
			+ " VALUES(?,?,?,?) ";
		
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buId);
			pStr.setString(2, dto.buName);
			pStr.setString(3, dto.buTel);
			pStr.setString(4, dto.buAddr);
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return 0;
	}

	public int update(BuyerDto dto) {
		
		String sql= " UPDATE tbl_buyer "
				+ " SET buName = ? , "
				+ " buTel = ? , "
				+ " buAddr = ? , "
				+ " WHERE buId = ?     ";
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buId);
			return pStr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

}
