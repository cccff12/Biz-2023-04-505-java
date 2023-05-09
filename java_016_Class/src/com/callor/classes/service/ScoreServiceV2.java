package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import com.callor.classes.models.ScoreDto;
public class ScoreServiceV2 {
	ScoreDto sdto;
	// 이건 리스트를 매개변수로 받은 거임
	public void makeScore(List<ScoreDto> list) {
		for (int i = 0; i < 10; i++) {
			sdto= new ScoreDto(); //
			sdto.setStName("%03d");
			sdto.setScKor((int)(Math.random()*50)+51);
			sdto.setScEng((int)(Math.random()*50)+51);
			sdto.setScMath((int)(Math.random()*50)+51);
			list.add(sdto);
		}
		
	}
	
//  scoreList 변수를 ScoreServiceV2 클래스의
//	다른 method에서 사용하기 위하여
//	클래스 영역으로 scope를 이동한다
//	클래스 영역으로 scope가 이동된 객체변수는
//	선언만 수행한다.
//	선언만 수행된 객체변수는 사용하려고 하면 
//	nullpointexception 이 발생할 수 있다.
//	makeScore()method가 시작되는 곳에서 scoreList 를 
//	초기화 해야 한다.	
	private List<ScoreDto>scoreList;
	public void makeScore() {
	
		scoreList= new ArrayList<>();
		
	this.makeScore();
	
	}
	
	
	/*
	
	List<ScoreDto> list= new ArrayList();
	public void makeScore() {
		for (int i = 0; i < 10; i++) {
			sdto= new ScoreDto(); //
			sdto.setStName("%03d");
			sdto.setScKor((int)(Math.random()*50)+51);
			sdto.setScEng((int)(Math.random()*50)+51);
			sdto.setScMath((int)(Math.random()*50)+51);
			list.add(sdto);
		}
	}
	
	public void print() {
		for(int i= 0; i<list.size();i++) {
			System.out.println(list.get(i).toString());
		
		}
		
	}
	
*/
	
}
