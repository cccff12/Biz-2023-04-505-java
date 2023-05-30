package com.callor.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.config.DBConnection;
import com.callor.shop.config.DBContract;
import com.callor.shop.model.ProductDto;
import com.callor.shop.service.ProductService;

public class ProductServiceimplV1 implements ProductService {

	protected final Connection dbConn;

	public ProductServiceimplV1() {
		dbConn = DBConnection.getDBConn();
	}

	protected ProductDto resultDto(ResultSet result) throws SQLException {
		ProductDto proDto= new ProductDto();
		proDto.pCode= result.getString(DBContract.Product.pCode);
		proDto.pName= result.getString(DBContract.Product.pName);
		proDto.pItem= result.getString(DBContract.Product.pItem);
		proDto.pIPrice= result.getInt(DBContract.Product.pIPrice);
		proDto.pOPrice= result.getInt(DBContract.Product.pOPrice);
		return proDto;
	}
	
	public List<ProductDto> dblist(PreparedStatement pStr) throws SQLException{
		ResultSet result =pStr.executeQuery();
		List<ProductDto> prolist= new ArrayList<>();
		while(result.next()) {
			ProductDto proDto =  resultDto(result);
			prolist.add(proDto);
		}
		return prolist;
	}

	
	
	
	
	public List<ProductDto> selectAll() {
		
		String sql= " SELECT pCode, pName, pItem, pIPrice, pOPrice "
				+ " FROM tbl_product "
				+ " ORDER BY pCode ";
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			List<ProductDto> proDto = dblist(pStr);
			return proDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ProductDto findBypCode(String pCode) {
		String sql =" SELECT pCode, pName, pItem, pIPrice, pOPrice "
				+ " FROM tbl_product "
				+ " WHERE pCode = ? ";
		
		PreparedStatement pStr;
		try {
			pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, pCode);
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

	
	
	public ProductDto findpiprice(String price) {
		String sql =" SELECT pCode, pName, pItem, pIPrice, pOPrice "
				+ " FROM tbl_product "
				+ " WHERE pIPrice = ? ";
		PreparedStatement pStr;
		try {
			pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, price);
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
	
	
	
	
	
	
	
	
	@Override
	public int insert(ProductDto dto) {
	String sql= " INSERT INTO tbl_product(pCode, pName, pItem, pIPrice, pOPrice) "
			+ " VALUES(?,?,?,?,?) ";
		PreparedStatement pStr;
		try {
			pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pCode);
			pStr.setString(2, dto.pName);
			pStr.setString(3, dto.pItem);
			pStr.setInt(4, dto.pIPrice);
			pStr.setInt(5, dto.pOPrice);
			int result= pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int update(ProductDto dto) {
		String sql= " UPDATE tbl_product "
				+ " SET pName = ?, "
				+ " pItem = ?, "
				+ " pIPrice = ?, "
				+ " pOPrice = ? "
				+ " WHERE pCode = ? ";
			
		try {
			PreparedStatement pStr= dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pName);
			pStr.setString(2, dto.pItem);
			pStr.setInt(3, dto.pIPrice);
			pStr.setInt(4, dto.pOPrice);
			pStr.setString(5, dto.pCode);
			int result= pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
