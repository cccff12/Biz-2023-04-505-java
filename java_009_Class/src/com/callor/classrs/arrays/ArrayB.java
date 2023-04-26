package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class ArrayB {

	public static void main(String[] args) {

		// ScoreServiceA 클래스에 선언된 method를 사용하기 위해 객체 변수 생성
		ScoreServiceA scoreServiceA = new ScoreServiceA();

		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();

		홍길동.stNum = "0001";
		홍길동.stName = "홍길동";
		홍길동.scKor = scoreServiceA.getScore();
		홍길동.scEng = scoreServiceA.getScore();
		홍길동.scMath = scoreServiceA.getScore();

		이몽룡.stNum = "0002";
		이몽룡.stName = "이몽룡";
		이몽룡.scKor = scoreServiceA.getScore();
		이몽룡.scEng = scoreServiceA.getScore();
		이몽룡.scMath = scoreServiceA.getScore();

		성춘향.stNum = "0003";
		성춘향.stName = "성춘향";
		성춘향.scKor = scoreServiceA.getScore();
		성춘향.scEng = scoreServiceA.getScore();
		성춘향.scMath = scoreServiceA.getScore();

		System.out.println("-".repeat(60));

		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");

		System.out.println("-".repeat(60)); // java 1.8 이하에서만 사용 가능한 메서드 .repeat
		
		// 각 학생 정보 출력
		scoreServiceA.scorePrint(홍길동);
		scoreServiceA.scorePrint(이몽룡);
		scoreServiceA.scorePrint(성춘향);

		System.out.println("-".repeat(60));
		
		
		
		
		

	}

}