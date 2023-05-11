package com.callor.classes.exec;

import com.callor.classes.service.impl.ScoreServiceImplV2;

public class t1 {
	public static void main(String[] args) {
		ScoreServiceImplV2 scov2 = new ScoreServiceImplV2();
		scov2.loadScore();
		scov2.printScore();
		
		
	}
}
