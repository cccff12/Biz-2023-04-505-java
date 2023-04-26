package com.callor.classrs.arrays;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.model.ScoreDto;

public class ArrayA {
	//socoreserviceA클래스에 선언된 method를 사용하기 위해 객체변수 생성
    ScoreServiceA scoerservicea = new ScoreServiceA(); 

	public static void main(String[] args) {

		
		// Dto를 선언하는 방법은 다른 클래스의 메소드를 불러오는 방법과 같다.

		// ( 클래스 이름 선언할 이름 = new 클래스이름(); ) 다만 control+shift+o가 필요 없다.
		// 그리고 선언 후 만약 홍길동을 대입하고 싶다면 홍길동. 까지만 입력해도 목록이 뜬다
		// 거기에 변수처럼 대입하면 된다

		//3명 학생의 성적정보를 저장할 
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		//홍길동 학생의 학번, 이름, 과목점수 세팅
		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		홍길동.scEng = (int) (Math.random() * 50) + 51;
		홍길동.scKor = (int) (Math.random() * 50) + 51;
		홍길동.scMath = (int) (Math.random() * 50) + 51;

		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		이몽룡.scEng = (int) (Math.random() * 50) + 51;
		이몽룡.scKor = (int) (Math.random() * 50) + 51;
		이몽룡.scMath = (int) (Math.random() * 50) + 51;

		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		성춘향.scEng = (int) (Math.random() * 50) + 51;
		성춘향.scKor = (int) (Math.random() * 50) + 51;
		성춘향.scMath = (int) (Math.random() * 50) + 51;

		
		//성적표 타이틀 출력
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(60));
		
		
		
		// 각 학생의 성적정보 출력
		System.out.println(홍길동.stNum + "\t" + 홍길동.stName + "\t" + 홍길동.scKor + "\t" + 홍길동.scEng + "\t" + 홍길동.scMath
				+ "\t" + 홍길동.getTotal() + "\t" + 홍길동.getAvg());
		System.out.println(이몽룡.stNum + "\t" + 이몽룡.stName + "\t" + 이몽룡.scKor + "\t" + 이몽룡.scEng + "\t" + 이몽룡.scMath
				+ "\t" + 이몽룡.getTotal() + "\t" + 이몽룡.getAvg());
		System.out.println(성춘향.stNum + "\t" + 성춘향.stName + "\t" + 성춘향.scKor + "\t" + 성춘향.scEng + "\t" + 성춘향.scMath
				+ "\t" + 성춘향.getTotal() + "\t" + 성춘향.getAvg());

	}
}

// %3d: 3자리의 자릿수를 확보 오른쪽 정렬
