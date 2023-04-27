package com.callor.score;

import method.servicea;
import scoreDto.ScoreDto;

public class oneday {

	public static void main(String[] args) {

		servicea ser = new servicea();

		ScoreDto[] score = new ScoreDto[10];

		String[] nums = { "23001", "23002", "23003", "23004", "23005", 
				"23006", "23007", "23008", "23009", "23010" };

		for (int i = 0; i < score.length; i++) {
			score[i] = new ScoreDto();
		}

		for (int i = 0; i < score.length; i++) {
			score[i].kor = ser.ran();
			score[i].eng = ser.ran();
			score[i].math = ser.ran();
			score[i].music = ser.ran();
			score[i].art = ser.ran();
			score[i].num = nums[i];
		}
		int korall = 0;
		int engall = 0;
		int mathall = 0;
		int musicall = 0;
		int artall = 0;
		for (int i = 0; i < score.length; i++) {
			korall += score[i].kor;
			engall += score[i].eng;
			mathall += score[i].math;
			musicall += score[i].music;
			artall += score[i].art;
		}
		int all = korall + engall + mathall + musicall + artall;
		float koravg = (float) korall / 10;
		float engavg = (float) engall / 10;
		float mathavg = (float) mathall / 10;
		float musicavg = (float) musicall / 10;
		float artavg = (float) artall / 10;
		float allavg = (float) (koravg + engavg + mathavg +
				musicavg + artavg) / 5;

		System.out.println("=".repeat(80));
		System.out.println("* 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(80));
		for (int i = 0; i < score.length; i++) {
			ser.print(score[i]);
		}
		System.out.println("-".repeat(80));
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", 
				korall, engall, mathall, musicall, artall, all);
		System.out.printf("평균\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n",
				koravg, engavg, mathavg, musicavg, artavg,
				allavg);
		System.out.println("=".repeat(80));

	}
}
