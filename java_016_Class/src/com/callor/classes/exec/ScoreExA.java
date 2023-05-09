package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.impl.ScoreServiceimplV3;

public class ScoreExA {
	
	
	public static void main(String[] args) {
		ScoreService scService= new ScoreServiceimplV3();
		scService.makeSocre();
		scService.printScore();
		
		
		
	}
}
