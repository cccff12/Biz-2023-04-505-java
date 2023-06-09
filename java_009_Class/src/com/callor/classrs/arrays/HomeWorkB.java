package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class HomeWorkB {
	public static void main(String[] args) {
		// DB로부터 가져온 데이터, 키보드 등으로 프로젝트가 실행되는
		// 중에 생성된 데이터를 배열에 저장하는 방법
		String[] names1 = new String[10];
		names1[0] = "홍길동";
		names1[1] = "이몽룡";
		names1[2] = "성춘향";
		names1[3] = "장보고";
		names1[4] = "임꺽정";
		names1[5] = "김철수";
		names1[6] = "김희경";
		names1[7] = "이기동";
		names1[8] = "박철수";
		names1[0] = "한동후";
		// 문자열 타입의 class type 배열 10개 선언
		// ={}; 에 표시된 요소들을 기본 값으로 하여
		// names배열 생성하기
		// names 배열의 요소에 저장할 값이 미리 확정된 경우
		String[] names = { "홍길동", "이몽룡", "성춘향", "장보고", "임꺽정",
				"김철수", "김희경", "이기동", "박철수", "한동후" };

		for(int i= 0; i<names.length;i++) {
			System.out.println(names[i]+"\t");
		}
		System.out.println();
		
		ScoreDto score = new ScoreDto();
		// names(학생이름) 배열의 요소 개수 만큼 scores 배열 요소를 생성하고 싶다 
		ScoreDto[] scores = new ScoreDto[names.length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		ScoreServiceA scService = new ScoreServiceA();

		for (int i = 0; i < scores.length; i++) {
			// names배열에 저장된 학생이름을 순서대로 
			//scores 배열 요소의 stName 속성에 복사하기
			scores[i].stName=names[i];
			
			scores[i].stNum=""+(i+1);
			scores[i].stNum=String.format("S%05d", (i+1));
			// 각 학생의 과목 성적을 랜덤수 샘플데이터로 세팅하기
			scores[i].scMath = scService.getScore();
			scores[i].scKor = scService.getScore();
			scores[i].scEng = scService.getScore();
		}
		
		
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));
		for(int i =0; i<scores.length;i++) {
			scService.scorePrint(scores[i]);
		}
		
		
		
	}
}
