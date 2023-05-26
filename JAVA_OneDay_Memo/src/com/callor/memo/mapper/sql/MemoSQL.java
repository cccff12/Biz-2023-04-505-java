package com.callor.memo.mapper.sql;

public class MemoSQL {

	public static final String MEMO_INSERT 
	= " INSERT INTO tbl_memo("
	+ " m_seq, m_writer, m_date, m_subject, m_content) "
	+ " VALUES("
	+ " #{m_seq}, #{m_writer}, "
	+ " #{m_date} , #{m_subject},#{m_content} ) ";
	
	
	public static final String MEMO_UPDATE 
	= " UPDATE tbl_memo "
			+ "SET m_content = #{m_content} "
			+ " m_writer = #{m_writer} "
			+ " m_date = #{m_date}  "
			+ " m_subject = #{m_subject} "
			+ "WHERE m_seq = #{m_seq} ";

	
	public static final String MEMO_DELETE // 칼럼 한 삭제
	="DELETE tbl_memo"
			+ "WHERE m_seq= #{m_seq}"
	;
	
	
	
}
