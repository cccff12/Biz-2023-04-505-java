package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.model.IolistDto;
import com.callor.shop.service.IolistService;

public class IolistServiceimplV1 implements IolistService {

	protected Connection dbConn;

	public IolistServiceimplV1() {
		super();
		dbConn = DBConnection.getDBConn();

	}
	
		protected IolistDto resultDto(ResultSet result) {
			IolistDto ioDto= new IolistDto();
			try {
				ioDto.ioSEQ= result.getLong(DBContract.Iolist.ioSEQ);
				ioDto.ioDate= result.getString(DBContract.Iolist.ioDate);
				ioDto.ioTime= result.getString(DBContract.Iolist.ioTime);
				ioDto.ioBuId= result.getString(DBContract.Iolist.ioBuId);
				ioDto.ioPCode= result.getInt(DBContract.Iolist.ioPCode);
				ioDto.ioQuan=result.getInt(DBContract.Iolist.ioQuan);
				ioDto.ioPrice= result.getInt(DBContract.Iolist.ioPrice);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ioDto;
		
		}
	

	public IolistDto findByseq(long seq) {
		String sql= " SELECT ioSEQ, ioDate, ioTime, ioBuId, ioPCode, ioQuan, ioPrice "
				+ "FROM tbl_iolist "
				+ " WHERE ioSEQ = ? ";
		
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setLong(1, seq);
			ResultSet result= pStr.executeQuery();
			if(result.next()) {
				return resultDto(result);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	public int insert(IolistDto dto) {
		String sql= " INSERT INTO tbl_iolist "
				+ " ( ioSEQ, ioDate, ioTime, ioBuId, ioPCode, ioQuan, ioPrice )"
				+ " VALUES( "
				+ " seq_iolist.NEXTVAL, "
				+ "?, "
				+ "?, "
				+ "?, "
				+ "?, "
				+ "?, "
				+ "?, "
				+ "?, ) ";
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setLong(1, dto.ioSEQ);
			pStr.setString(2, dto.ioDate);
			pStr.setString(3, dto.ioTime);
			pStr.setString(4, dto.ioBuId);
			pStr.setInt(5, dto.ioPCode);
			pStr.setInt(6, dto.ioQuan);
			pStr.setInt(7, dto.ioPrice);
			pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int update(IolistDto dto) {
		
		String str= "UPDATE tbl_iolist "
				+ " SET ioDate = ?, "
				+ "ioTime = ?, "
				+ "ioBuId = ?, "
				+ "ioPCode = ?, "
				+ "ioQuan = ?, "
				+ "ioPrice = ?"
				+ "WHERE ioSEQ = ? ";
			try {
				PreparedStatement pStr= dbConn.prepareStatement(str);

				pStr.setString(1, dto.ioDate);
				pStr.setString(2, dto.ioTime);
				pStr.setString(3, dto.ioBuId);
				pStr.setInt(4, dto.ioPCode);
				pStr.setInt(5, dto.ioQuan);
				pStr.setInt(6, dto.ioPrice);
				pStr.setLong(7, dto.ioSEQ);
			 int result = pStr.executeUpdate();
			 return result;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return 0;
	}

	

}
