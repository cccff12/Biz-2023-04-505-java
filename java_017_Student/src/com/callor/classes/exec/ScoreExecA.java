package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.impl.ScoreServiceimplV1;

public class ScoreExecA {

	public static void main(String[] args) {
		ScoreService scService= new ScoreServiceimplV1();
	
	scService.loadScore();
	scService.printScore();
	
	}
	
	
}
