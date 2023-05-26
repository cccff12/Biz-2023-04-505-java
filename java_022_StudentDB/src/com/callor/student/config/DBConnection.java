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
	TransactionFactory transactionFactory
	= new JdbcTransactionFactory();
		
	Environment environment =
			new Environment("dev", transactionFactory, dataSource);
	Configuration configuration= new Configuration(environment);
	
//	 mapper라는 패키지 안의 인터페이스 안에 코드를 읽어서 명령 수행
	configuration.addMappers("com.callor.student.mapper");
	
	
	sqlSesiFactory
	= new SqlSessionFactoryBuilder().build(configuration);
	
		
	}
	
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
		
		
		
	}
	
}
