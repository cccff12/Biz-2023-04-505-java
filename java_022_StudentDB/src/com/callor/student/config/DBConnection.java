package com.callor.student.config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class DBConnection {

	private static SqlSessionFactory sqlSesiFactory;
	static {
//	DATASOURCE는 DBMS와 연결되는 통로를 만든다		
		DataSource dataSource
		= new PooledDataSource(
				DBContract.JDBC_DRIVER,
				DBContract.DB_URL,
				DBContract.USER_NAME,
				DBContract.PASSWORD
				);
//		여러개의 테이블에 대하여 CRUD를 실행할때 타이밍에 
//		의한 데이터 sync오류 등을 자체적으로 관리하는 도구
	TransactionFactory transactionFactory
	= new JdbcTransactionFactory();
		
//	mybatis를 사용하여 DBMS에 연결하기 위한 환경 설정
	Environment environment =
			new Environment("dev", transactionFactory, dataSource);
	
//	환경설정 등을 mybatis 의 Sqlsessionfactory 에게 전달하기 위한 객체
	Configuration configuration= new Configuration(environment);
	
//	 mapper라는 패키지 안의 인터페이스 안에 코드를 읽어서 명령 수행
//	Dao interface 가 저장되어 있는 package를 지정한다. 
//	Mybatis 는 Dao interface 파일을 scan하여 
//  Annotation 으로 설정된 sql명령문과 
//	각 
	configuration.addMappers("com.callor.student.mapper");
	
	
	sqlSesiFactory = 
			new SqlSessionFactoryBuilder().build(configuration);
	
		
	}
	
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
		
		
		
	}
	
}
