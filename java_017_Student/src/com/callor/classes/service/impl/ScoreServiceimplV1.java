package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;
import com.callor.classes.service.StudentService;

/*
 * interface(class)를 implements 한 클래스는
 * interface에 선언된 모든 method 를 의무적으로 구현해야 한다
 * interface에 선언된 method 를 한개라도 생략하면
 * 		클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */
public class ScoreServiceimplV1 implements ScoreService {
	protected List<ScoreDto> scList; // = new ArrayList<>();

	public ScoreServiceimplV1() {
		scList = new ArrayList<>();
	}

//  성적정보 문자열 1개를 컴마로 분해하고 scoreDto객체로 변환하여 return 하는 method
	protected ScoreDto str2Dto(String str) {

		String[] score = str.split(",");
		ScoreDto scDto = new ScoreDto(score[DataIndex.SCORE.ST_NUM], 
				Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
				Integer.valueOf(score[DataIndex.SCORE.SC_ENG]), 
				Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
				Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]), 
				Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
				Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
				Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE]));

		return scDto;
	}

	public void loadScore() {
		for (String str : DataSource.SCORE) {
			ScoreDto scDto = str2Dto(str);
			scList.add(scDto);
		}
	}

	// public void loadScore() {
// DataSource의 SCORE를 한 줄씩(한줄이 그냥 문자열 1개니까)밑에 반복문으로 돌린다.
// 그리고 다음 줄 

//	 		for(String str : DataSource.SCORE) {
//			String[] score = str.split(",");
//	 		ScoreDto scDto = new ScoreDto(
//					score[DataIndex.SCORE.ST_NUM],
//					Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_ENG]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
//			);

//		
//		ScoreDto scDto = str2Dto(str);
//			scList.add(scDto);
//		
//	}
	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		StudentService stService = new StudentServiceimplV1();
		stService.loadStudent();
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t국어\t영어\t수학\t음악\t미술");
		System.out.println(Line.SLINE(100));
		for (ScoreDto dto : scList) {
			System.out.print(dto.getStNum() + "\t");

			StudentDto stDto = stService.getStudent(dto.getStNum());
			if (stDto != null) {
				System.out.print(stDto.stName + "\t");
				System.out.print(stDto.stDep + "\t");
			} else {
				System.out.print("-" + "\t");// 이름 정보 없음
				System.out.print("-" + "\t");// 학과 정보 없음
			}

			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			System.out.print(dto.getScSoftWare() + "\t");
			System.out.print(dto.getScDataBase() + "\n");
		}
	}
}