package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.callor.classes.config.Line;
import com.callor.classes.models.ScoreDto;

public class ScoreServiceImplV2 extends ScoreServiceimplV1 {
	public ScoreServiceImplV2() {
		// V1 에서 protected로 선언 scList 를 사용할수 있도록
		// 초기화하는 작업, 반드시 필요
		scList = new ArrayList<>();
	}

	public void loadScore() {
		String scoreFile = "src/com/callor/classes/datas/score.csv";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(scoreFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			ScoreDto dto = str2Dto(line);
			scList.add(dto);
		}
	}

	public void printScore() {
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술");
		
		for (ScoreDto stDto : scList) {
			System.out.print(stDto.getStNum()+ "\t");
			System.out.print(stDto.getScKor() + "\t");
			System.out.print(stDto.getScEng() + "\t");
			System.out.print(stDto.getScMath()+ "\t");
			System.out.print(stDto.getScMusic()+ "\t");
			System.out.print(stDto.getScArt()+ "\n");
		}
	}
}