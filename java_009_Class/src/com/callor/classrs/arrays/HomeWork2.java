package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class HomeWork2 {

	public static void main(String[] args) {

		ScoreDto[] scores = new ScoreDto[10];
// Dto를 타입취급해 배열초기화
		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}//  

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

		int allkor = scores[0].scKor + scores[1].scKor + scores[2].scKor + scores[3].scKor + scores[4].scKor
				+ scores[5].scKor + scores[6].scKor + scores[7].scKor + scores[8].scKor + scores[1].scKor;
		int alleng = scores[0].scEng + scores[1].scEng + scores[2].scEng + scores[3].scEng + scores[4].scEng
				+ scores[5].scEng + scores[6].scEng + scores[7].scEng + scores[8].scEng + scores[9].scEng;
		int allMath = scores[0].scMath + scores[1].scMath + scores[2].scMath + scores[3].scMath + scores[4].scMath
				+ scores[5].scMath + scores[6].scMath + scores[7].scMath + scores[8].scMath + scores[9].scMath;
		int all = allkor + alleng + allMath;

		System.out.println("=".repeat(70));
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
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

		System.out.printf(" ".repeat(15) + "\t" + allkor + "\t" + alleng + "\t" + allMath + "\t" + all + "\n");
		System.out.println("=".repeat(70));

	}
}
