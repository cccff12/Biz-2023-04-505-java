package com.callor.memo.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class MemoService {
	SqlSession sqlSession;
	MemoDao mDao;
	Scanner scan;

	public MemoService() {
		sqlSession = DBConnection.getFactory().openSession(true);
		mDao = sqlSession.getMapper(MemoDao.class);
		scan = new Scanner(System.in);
	}

	public void select() {
		List<MemoDto> memolist = mDao.selectAll();
		for (MemoDto dto : memolist) {
			System.out.print(dto.m_seq + "\t");
			System.out.print(dto.m_writer + "\t");
			System.out.print(dto.m_date + "\t");
			System.out.print(dto.m_subject + "\t");
			System.out.println(dto.m_content);
		}

	}

	public int insert() {
		System.out.println("데이터 새롭게 추가");
		System.out.println("일련번호 입력");

		System.out.println("작성자");
		String writer = scan.nextLine();

		System.out.println("작성일자");
		String date = scan.nextLine();

		System.out.println("제목");
		String subject = scan.nextLine();

		System.out.println("내용");
		String content = scan.nextLine();

		MemoDto mDto = new MemoDto();
		mDto.m_writer = writer;
		mDto.m_date = date;
		mDto.m_subject = subject;
		mDto.m_content = content;
		int result = mDao.insert(mDto);
		if (result > 0) {
			System.out.println("데이터 추가 완료");
		} else {
			System.out.println("데이터 추가 실패");
		}

		return 0;
	}

	public int update() {

		
		
		
		
		
		
		
		
		
		return 0;

	}

	public int delete() {

		return 0;
	}

	public MemoDto findid(long seq) {
		System.out.println("조회하고자 일련번호를 입력하세요");
		String str = scan.nextLine();
		
		
		
		
		
		
		return null;
		
	}
	
	
}
