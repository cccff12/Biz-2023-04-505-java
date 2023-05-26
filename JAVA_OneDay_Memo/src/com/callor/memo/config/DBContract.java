package com.callor.memo.config;

public class DBContract {

	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "MEMO";
	public static final String PASSWORD = "12341234";

	public static class TABLE {
		public static final String MEMO = "tbl_memo";

	}

	public static class COLUMN {
		public static class STUDENT {
			public static final String m_seq = "m_seq";
			public static final String m_writer = "m_writer";
			public static final String m_date = "m_date";
			public static final String m_subject = "m_subject";
			public static final String m_content = "m_content";

		}


	}

}
