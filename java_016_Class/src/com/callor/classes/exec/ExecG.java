package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.impl.ScoreServiceimplV3;
import com.callor.classes.service.impl.ScoreServiceimplV4;

public class ExecG {
public static void main(String[] args) {
	
	
	/*
	 * ScoreService interface로 객체를 선언하고
	 * ScoreServiceimplV() 생성자로 객체를 생성(초기화 )한다.
	 * 
	 * ScoreServiceimplv3 클래스에 정의된(선언된) method를 사용하던 중
	 * 더 좋은 ScoreServicev4클래스를 프로젝트에서 사용하려면 클래스 생성자 이름만 변경하면 
	 * 나머지 코드는 변경할 필요가 없다
	 */
	
	
	ScoreService scService = new ScoreServiceimplV3();
	scService.makeSocre();
	scService.printScore();
	// scoreservice로 선언을 하고 ~~v4로 scService1을 생성함
//	중간에 v3에서 v4로 바꿔도 문제가 없음
	ScoreService scService1= new ScoreServiceimplV4();
	scService1.printScore();
	
	
	
}
}
