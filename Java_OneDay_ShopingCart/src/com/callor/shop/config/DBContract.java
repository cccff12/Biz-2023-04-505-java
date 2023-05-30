package com.callor.shop.config;

public class DBContract {

	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "shopingcart";
	public static final String PASSWORD = "12341234";

	public static class BUYER {
		public static final int BUID = 1;
		public static final int buName = 2;
		public static final int buTel = 3;
		public static final int buAddr = 4;

	}

	public static class Iolist {
		public static final int ioSEQ = 1;
		public static final int ioDate = 2;
		public static final int ioTime = 3;
		public static final int ioBuId = 4;
		public static final int ioPCode = 5;
		public static final int ioQuan = 6;
		public static final int ioPrice = 7;
	}

	public static class Product {
		public static final int pCode = 1;
		public static final int pName=2;
		public static final int pItem=3;
		public static final int pIPrice=4;
		public static final int pOPrice=5;
		
	}

}
