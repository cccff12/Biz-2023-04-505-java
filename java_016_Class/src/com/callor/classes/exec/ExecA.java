package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.service.ScoreServiceV1;

public class ExecA {

	
	public static void main(String[] args) {
//		ScoreServiceV1에 정의된 method를 사용하기 위하여
//		클래스를 객체로 생성하는 절차 ㅡScoreServiceV1 scService= new ScoreServiceV1();

//		method사용하기= 메서드 호출
//		정의된(작성된) method에게 어떤 일을 시키는 것
//		객체를 만들어 호출하는 것
		ScoreServiceV1 scService= new ScoreServiceV1();
		scService.makeScore();
		scService.printScore();
//		integer List 타입의 scoreList객체 변수 생성
		List<Integer>scoreList=new ArrayList<>();
	
//	makeScore()method호출, 사용	
//	scoreList 라는 데이터가 담긴 객체변수의 기억장치 주소 전달
//		makeScore()method에게 전달하면서 뭔가를 요청
scService.makeScore(scoreList);		


//makescore를 호출하면서
//method를 호출하면서 scoreList라는 데이터가 담긴 
// 객체변수의 기억장치 주소를 전달하고 return 된 결과를 result변수에 저장
int result = scService.makeScore(scoreList);		
	
	
	}
	
}
