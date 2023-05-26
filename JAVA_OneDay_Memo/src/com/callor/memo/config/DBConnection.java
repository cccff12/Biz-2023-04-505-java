package com.callor.memo.config;

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
//	데이터 sync오류 등을 자체적으로 관리하는 도구
	TransactionFactory transactionFactory
	= new JdbcTransactionFactory();
		
//	mybatis를 사용하여 DBMS에 연결하기 위한 환경 설정
	Environment environment =
			new Environment("dev", transactionFactory, dataSource);
	
//	환경설정 등을 mybatis 의 Sqlsessionfactory 에게 전달하기 위한 객체
	Configuration configuration= new Configuration(environment);
	

	configuration.addMappers("com.callor.memo.mapper");
	
	
	sqlSesiFactory = 
			new SqlSessionFactoryBuilder().build(configuration);
		
	}
	
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
		
		
		
	}
	
}