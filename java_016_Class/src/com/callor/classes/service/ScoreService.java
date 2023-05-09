package com.callor.classes.service;
import java.util.List;
import com.callor.classes.models.ScoreDto;
/*
 * java의 interface:
 * 클래스의 설계
 * 클래스의 부모 클래스
 */
public interface ScoreService {
	//코드 블럭(   {}   )이 없는 method의 원형(모형)만 선언하기
// 코드 구현체(코드블럭)가 없는 클래스
	public void makeSocre();
	public void makeSocre(List<ScoreDto>scList);
	public void printScore();
	public void printScore(List<ScoreDto>scList);
	
	
}
