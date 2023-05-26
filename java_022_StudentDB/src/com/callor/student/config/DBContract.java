package com.callor.student.config;

public class DBContract {

	// DB연결 정보를 변수로 선언
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";// .class 삭제
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe"; // 이건 고정 그대로 적어야함
	public static final String USER_NAME = "student";
	public static final String PASSWORD = "12341234";

	public static class TABLE {
		public static final String STUDENT = "tbl_student";
	}

	public static class COLUMN {
		public static class STUDNET {
			public static final String st_num = "st_num";
			public static final String st_name = "st_name";
			public static final String st_dept = "st_dept";
			public static final String st_grade = "st_grade";
			public static final String st_tel = "st_tel";

		}
	}

}
