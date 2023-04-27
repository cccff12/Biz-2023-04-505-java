package com.callor.classrs.exec;

import com.callor.classrs.Service.ScoreServiceA;
import com.callor.classrs.Service.t2;
import com.callor.classrs.model.ScoreDto;

public class t1 {
	public static void main(String[] args) {
		ScoreDto[] sdo = new ScoreDto[10];
		ScoreServiceA scoser = new ScoreServiceA();
		t2 scoser2 = new t2();
		for (int i = 0; i < sdo.length; i++) {
			sdo[i] = new ScoreDto();

		}
		sdo[0].stName = "아아아아";
		scoser.scorePrint(sdo[0]);
		scoser2.printall(sdo[0] sdo[1]);
	}
}
