package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class ArrayD {

	/*
	 * class type 의 객체(변수)배열 만들기 ClassNname[]object=new ClassName[10]
	 * 
	 * class type 배열은 일반 변수 배열과 달리 즉시 사용할수 없다 별도로 배열 요소를 초기화 시키는 코드가 필요하다
	 * 
	 */

	public static void main(String[] args) {

		// ScoreDto type요소 10개를 갖는 배열 선언
		ScoreDto[] scores = new ScoreDto[10];

		// class type 배열 요소 전체를 객체 요소로 생성하기
		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}

		ScoreServiceA scoreService = new ScoreServiceA();
		scores[0].stNum = "0001";
		scores[0].stName = "홍길동";
		scores[0].scKor = scoreService.getScore();
		scores[0].scEng = scoreService.getScore();
		scores[0].scMath = scoreService.getScore();

		scores[1].stNum = "0002";
		scores[1].stName = "이몽룡";
		scores[1].scKor = scoreService.getScore();
		scores[1].scEng = scoreService.getScore();
		scores[1].scMath = scoreService.getScore();
		
		scores[2].stNum = "0003";
		scores[2].stName = "성춘향";
		scores[2].scKor = scoreService.getScore();
		scores[2].scEng = scoreService.getScore();
		scores[2].scMath = scoreService.getScore();
		
		scores[3].stNum = "0004";
		scores[3].stName = "장보고";
		scores[3].scKor = scoreService.getScore();
		scores[3].scEng = scoreService.getScore();
		scores[3].scMath = scoreService.getScore();
		
		scores[4].stNum = "0005";
		scores[4].stName = "임꺽정";
		scores[4].scKor = scoreService.getScore();
		scores[4].scEng = scoreService.getScore();
		scores[4].scMath = scoreService.getScore();
		
		scores[5].stNum = "0006";
		scores[5].stName = "김철수";
		scores[5].scKor = scoreService.getScore();
		scores[5].scEng = scoreService.getScore();
		scores[5].scMath = scoreService.getScore();
		
		scores[6].stNum = "0007";
		scores[6].stName = "김희경";
		scores[6].scKor = scoreService.getScore();
		scores[6].scEng = scoreService.getScore();
		scores[6].scMath = scoreService.getScore();
		
		scores[7].stNum = "0008";
		scores[7].stName = "이기동";
		scores[7].scKor = scoreService.getScore();
		scores[7].scEng = scoreService.getScore();
		scores[7].scMath = scoreService.getScore();
		
		scores[8].stNum = "0009";
		scores[8].stName = "박철수";
		scores[8].scKor = scoreService.getScore();
		scores[8].scEng = scoreService.getScore();
		scores[8].scMath = scoreService.getScore();
		
		scores[9].stNum = "0010";
		scores[9].stName = "한동후";
		scores[9].scKor = scoreService.getScore();
		scores[9].scEng = scoreService.getScore();
		scores[9].scMath = scoreService.getScore();
		
		System.out.println("=".repeat(70));

		System.out.println("=".repeat(70));

		scoreService.scorePrint(scores[0]);
		scoreService.scorePrint(scores[1]);
		scoreService.scorePrint(scores[2]);
		scoreService.scorePrint(scores[3]);
		scoreService.scorePrint(scores[4]);
		scoreService.scorePrint(scores[5]);
		scoreService.scorePrint(scores[6]);
		scoreService.scorePrint(scores[7]);
		scoreService.scorePrint(scores[8]);
		scoreService.scorePrint(scores[9]);
	
		System.out.println("-".repeat(70));
	
	
	
	
	}
}
