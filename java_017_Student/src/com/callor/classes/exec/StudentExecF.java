package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;

public class StudentExecF {

	
	public static void main(String[] args) {
		
		// 인터페이스로 설정하고 생성자로 생성하기
		ScoreService scService= new ScoreServiceimplV2();

	scService.loadScore();
	scService.printScore();
	
	
	
	}
	
	
}
