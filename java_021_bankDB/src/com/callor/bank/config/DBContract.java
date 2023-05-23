package com.callor.bank.config;

/*
 * DB와 연결하는 Session(통로) 을 만드는 클래스 도구
 */
public class DBContract {

	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver"; // 아까 다운받은 JARD를 설정
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";// DB까지 거쳐가는 경로 조절
	public static final String USER_NAME = "C##myuser";// 사용자 아이디 저장
	public static final String PASSWORD = "12341234";// 사용자 패스워드 저장

	public static class BUYER {
		public static final int BUID = 1;
		public static final int BUNAME = 2;
		public static final int BUTEL = 3;
		public static final int BUADDR = 4;
		public static final int BUBIRTH = 5;
		public static final int BUJOB = 6;
	}

}
