package com.callor.bank.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.bank.config.DBContract;

public class DbExecB {

	/*
	 * DB(DBMS Server)에 연결하는 절차 
	 * 1. Driver를 활성화(실행) 
	 * 2. 접속정보를 통하여 연결 
	 * 3. SQL전송 
	 * 4. 결과 받기
	 */
	public static void main(String[] args) {
		
		/*
		 * java에서 sql을 통해 select를 할때는 
		 * 반드시 칼럼을 원하는 순서대로 나열해 주자
		 * 가급적 별표(별표 말고도 어떤 순서)를 사용하지 말자
		 * 
		 * SQL을 여러 라인의 문자열로 나누고 연결하여 사용하는 경우
		 * "" 사이에 각 단어 앞뒤로 빈칸을 한 칸 이상씩 반드시 추가하자
		 */
		String sql = "SELECT buid, buname, butel, buaddr, bubirth, bujob " + "FROM tbl_buyer";

		// db와 연결하기 위한 input장치
		Connection conn = null; //1번

		// jdbcdriver를 lording하여 활성화
		try {
			Class.forName(DBContract.jdbcDriver);// 2번 이게 드라이브 활성화
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 연결정보를 설정하여 연결준비
		try {
//			DB_URL 경로를 통하여 USER_NAME 과 PASSWORD로 login 테스트 
//			로그인이 성공하면 연결 정보를 conn 객체에 저장해 달라
//			이거까지 되면 
			conn = DriverManager.getConnection(DBContract.DB_URL, //이게 3번  
					DBContract.USER_NAME,
					DBContract.PASSWORD);

			
//			DBMS에 연결하여 SQL보내기
//			문자열로 되어 있는 SQL명령문을 DBMS에 전달하는 데이터로 변환하는 일을 수행
//			변환이 성공하면 연결정보를 pStr 객체에 저장해 달라
			PreparedStatement pStr = conn.prepareStatement(sql); //4번
//			여기까지 하면 오라클이 데이터는 보내준것
			
			
//			DBMS에게 방금 생성한 pStr 객체에 담긴 정보를 바탕으로
//			SQL 을 실행하고, 실행결과 정보를 result에 저장해 달라
			ResultSet result = pStr.executeQuery();

//			DBMS 서버로부터 전달된 데이터를 읽어오기
//			next()method를 실행하여 한 줄의 데이터를 가져오기
//			이때 더 이상 읽을 데이터가 없으면 next () false return
			while (result.next()) {// scan.hasnext 랑 같음

				System.out.print(result.getString(DBContract.BUYER.BUID) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUNAME) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUTEL) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUADDR) + "\t");
				System.out.print(result.getString(DBContract.BUYER.BUBIRTH) + "\t");
				System.out.println(result.getString(DBContract.BUYER.BUJOB)); // 이게 데이터를 읽어들이는 절차
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		DBMS에 보낼 SQL명령문 만들기

//		DBMS에게 SQL실행을 요청하고 SQL이 실행된 결과를 ResultSet type의 객체에 받기

//		

	}
}
