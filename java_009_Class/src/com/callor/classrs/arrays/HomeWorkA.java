package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class HomeWorkA {
	public static void main(String[] args) {
		// 다른 클래스라 연결되지 않아 c S O를 눌러 연결
		// 한 학생의 점수를 관리하기 위한 객체 변수 생성
		// 생성 = 선언 + 초기화= 사용할 준비가 된 상태
		// ScoreDto 클래스를 사용해 score객체를 선언
		// ScoreDto() 생성자 method를 사용해
		// 객체를 초기화(new) 한다.
		ScoreDto score = new ScoreDto();

		// ScoreDto type의 scores배열을 선언하고 요소를 10개 선언한다.
		// scores 배열은 score 변수를 10개 요소로 갖는다
		ScoreDto[] scores = new ScoreDto[10];

		// class type 으로 선언된 배열은
		// 반드시 개별 요소를 초기화 시키는 절차가 필요하다
		// scores배열 (요소) 개수만큼 for반복문을 이용해
		// scores배열의 개별요소를 모두 초기화 한다.
		// scores배열의 모든 요소들이 초기화 되어
		// 사용할 준비가 완료된다.
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		// 학번, 이름, 과목점수를 각 배열의 요소에 세팅
		// ScoreServiceA클래스에 정의된
		// 점수생성 method, 개별 성적출력 method를 활용하기 위해
		// 객체 변수로 생성하기
		ScoreServiceA scService = new ScoreServiceA();
		
		scores[0].stName = "길동";
		scores[0].stNum = "0001";

		for(int i=0; i<scores.length;i++) {
		scores[i].scMath = scService.getScore();
		scores[i].scKor = scService.getScore();
		scores[i].scEng = scService.getScore();
		}
		
		
		
		
	
	
	
	
	
	
	}
}
