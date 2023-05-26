package com.callor.student.config.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.callor.student.config.DBConnection;
import com.callor.student.mapper.StudentDao;
import com.callor.student.models.StudentDto;

public class DBExecA {

	public static void main(String[] args) {
		
//		sqlsessionfactory 에게 db와 연결할 session 요청하기
//		openSession() 의 true: insert update delete 를 수행할 떄 
//		자동으로 commit 명령을 실행하라
//		이 옵션을 사용하지 않으면 java에서 추가 , 수정, 삭제한 데이터가 
//		sql developer 등에서 확인이 안될수 있다.
		SqlSession sqlSession= DBConnection.getFactory().openSession(true);
//		StudentDao interface 구현한 DaoImplV1과 같은 코드를 
//		생성하여 StDto에 담아준다
	StudentDao stDao= sqlSession.getMapper(StudentDao.class);
	List<StudentDto> stdList= stDao.selectAll();
	System.out.println(stdList.toString());
	
	
	}
	
	
}
